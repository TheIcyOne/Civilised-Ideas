package com.headfishindustries.civilisedideas.entities;

import com.headfishindustries.civilisedideas.CivilisedIdeas;
import com.headfishindustries.civilisedideas.entities.*;
import com.headfishindustries.civilisedideas.entities.render.*;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityManager{
	public static final EntityManager instance = new EntityManager();
	
	private EntityManager(){
		
	}
	
	public String GrappleID = "Grapple";
	
	public void registerEntities(){
		
		int updateFreq = 2;
		int updateDist = 32;
		boolean updateVelocity = true;
		
		EntityRegistry.registerModEntity(EntityGrapple.class, GrappleID, 120, CivilisedIdeas.instance, updateDist, updateFreq, updateVelocity);
	}
	
	@SideOnly(Side.CLIENT)
	public void registeryRenderInformation(){
		RenderingRegistry.registerEntityRenderingHandler(EntityGrapple.class, new RenderGrapple());
	}
}
