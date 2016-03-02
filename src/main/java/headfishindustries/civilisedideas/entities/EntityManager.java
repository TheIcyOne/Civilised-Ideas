package headfishindustries.civilisedideas.entities;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import headfishindustries.civilisedideas.CivilisedIdeas;
import headfishindustries.civilisedideas.entities.*;
import headfishindustries.civilisedideas.entities.render.*;

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
