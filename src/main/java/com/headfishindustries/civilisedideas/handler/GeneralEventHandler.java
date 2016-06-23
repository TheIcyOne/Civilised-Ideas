package com.headfishindustries.civilisedideas.handler;

import java.util.Random;

import org.lwjgl.Sys;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.item.EntityFireworkRocket;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFirework;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

public class GeneralEventHandler{
	
	Random randStuff = new Random();
	
	@SubscribeEvent
	public void onPlayerLogin(PlayerLoggedInEvent event){
		
		EntityPlayer player = event.player;
		System.out.println(player.getDisplayName());
		if (player.getDisplayName() == "The_Icy_One"){
				
				
				//All hail the creator!
				ItemStack boomThing = new ItemStack(Items.fireworks);
				boomThing.stackTagCompound = new NBTTagCompound();
				NBTTagCompound miniBoom = new NBTTagCompound();
				
				int[] colours = new int[randStuff.nextInt(8) + 1];
				for (int i = 0; i < colours.length; i++){
					colours[i] = net.minecraft.item.ItemDye.field_150922_c[randStuff.nextInt(16)];
				}
				
				miniBoom.setIntArray("Colors", colours);
				miniBoom.setBoolean("Trail", true);
				miniBoom.setBoolean("Flicker", true);
				miniBoom.setByte("Type",(byte) 1);
				
				NBTTagList explosion = new NBTTagList();
				explosion.appendTag(miniBoom);
				
				NBTTagCompound boomThingTag = new NBTTagCompound();
				boomThingTag.setTag("Explosions", explosion);
				boomThingTag.setByte("Flight",(byte) 1);
				
				boomThing.stackTagCompound.setTag("Fireworks", boomThingTag);
				
				player.getEntityWorld().spawnEntityInWorld(new EntityFireworkRocket(player.getEntityWorld(), player.lastTickPosX, player.lastTickPosY, player.lastTickPosZ, boomThing));
			}
	}

}
