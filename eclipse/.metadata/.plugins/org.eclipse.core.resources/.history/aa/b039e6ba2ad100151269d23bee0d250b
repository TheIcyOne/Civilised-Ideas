package headfishindustries.pvptools;

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

@Mod(modid = "pt", name = "PvP Tools", version = "1.0")

public class PvPTools {
	

	public static Block blockMine;
	public static Item itemOil;
	
	
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//Initialization of items and blocks
		//Config handling
		blockMine = new blockMine(Material.iron).setBlockName("BlockMine").setBlockTextureName("pt:blockMine");
		
		

		GameRegistry.registerBlock(blockMine, blockMine.getUnlocalizedName().substring(5));
		
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		//Proxy, TileEntity, entity, GUI and Packet registration
	
		
	}
	
	public void postInit(FMLPostInitializationEvent event) {
		
		
		
		
	}
	
	/*
	public static CreativeTabs tabPvPTools = new CreativeTabs("tabPvPTools"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(itemMine).getItem();		
	}
	};
	*/
}
