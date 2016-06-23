package com.headfishindustries.civilisedideas;

import com.headfishindustries.civilisedideas.entities.EntityGrapple;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemGrapple extends ItemBow{
	public ItemGrapple(){
		this.setMaxStackSize(1);
		this.setUnlocalizedName("itemGrapple");
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player){
		new EntityGrapple(world, player.posX, player.posY, player.posZ, player.rotationPitch, player.rotationYaw);
		return(item);
	}
}