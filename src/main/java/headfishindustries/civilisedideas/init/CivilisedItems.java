package headfishindustries.civilisedideas.init;

import headfishindustries.civilisedideas.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class CivilisedItems {
	
	public static Item copper_ingot;
	
	public static void init(){
		copper_ingot = new Item().setUnlocalizedName("copper_ingot");
	}
	
	public static void register(){
		GameRegistry.registerItem(copper_ingot, copper_ingot.getUnlocalizedName().substring(5));
	}
	public static void registerRenders(){
		registerRender(copper_ingot);
		
	}
	public static void registerRender(Item Item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item, 0, new ModelResourceLocation(Reference.MODID+":"+ copper_ingot.getUnlocalizedName().substring(5), "inventory"));
	}
}
