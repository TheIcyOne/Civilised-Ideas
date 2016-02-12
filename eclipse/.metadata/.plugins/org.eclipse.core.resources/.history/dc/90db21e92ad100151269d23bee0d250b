package headfishindustries.civilisedideas;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid="ci",name="Civilised Ideas", version="1.0")

public class CivilisedIdeas {
	public static Block blockSwapper;
	
	public static Item itemToken;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//Block and Item Initialization
		blockSwapper = new BlockSwapper(Material.anvil).setBlockName("blockSwapper");
		
		itemToken = new ItemToken();
		
				
		GameRegistry.registerBlock(blockSwapper, "Civilised Swapper");
		
		GameRegistry.registerItem(itemToken, "Trader's Token");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		//Proxy, TileEntity, entity, GUI and Packet registration
	
		
	}
	
	public void postInit(FMLPostInitializationEvent event) {
		
		
		
		
	}
	
}
