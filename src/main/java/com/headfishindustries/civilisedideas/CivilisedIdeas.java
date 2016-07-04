package com.headfishindustries.civilisedideas;

import com.headfishindustries.civilisedideas.block.*;
import com.headfishindustries.civilisedideas.commands.GetDim;
import com.headfishindustries.civilisedideas.item.ItemGodsTear;
import com.headfishindustries.civilisedideas.item.ItemWoodenSplinter;
import com.headfishindustries.civilisedideas.item.ItemWoodenWand;
import com.headfishindustries.civilisedideas.tab.HypoTab;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import org.apache.logging.log4j.Logger;

@Mod(modid="ci",modLanguage = "java", name="Civilised Ideas", version="1.0")

public class CivilisedIdeas {
	
	@Instance(value = "ci")
	public static CivilisedIdeas instance;
    public static Logger logger;
	
	public static Block blockRedrock = new BlockRedrock();
	public static Block blockWetrock = new BlockWetrock();
	public static Block blockBonerock = new BlockBonerock();
	public static Block blockWilliWeed = new BlockWilliWeed();
	public static Block blockSlindWeed = new BlockSlindWeed();
	public static Item ItemGodstear = new ItemGodsTear();
	public static Item ItemWoodensplinter = new ItemWoodenSplinter();
	public static Item ItemWoodenwand = new ItemWoodenWand();
	
	//public static Item itemGrapple;

	//public static Entity entityGrapple;
	
	public static CreativeTabs hypoTab = new HypoTab(CreativeTabs.getNextID(), "Hypovolemia");	
	
	@EventHandler
	public void serverStarting(FMLServerStartingEvent event){
		ICommandManager cmdManage = event.getServer().getCommandManager();
		ServerCommandManager svrCommandManage = ((ServerCommandManager)cmdManage);
		svrCommandManage.registerCommand(new GetDim());
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
        logger = event.getModLog();

		//Block and Item Initialization
		//itemGrapple = new ItemGrapple();
		
		GameRegistry.registerBlock(blockBonerock, "Bonerock").setCreativeTab(hypoTab);
		GameRegistry.registerBlock(blockRedrock, "Redrock").setCreativeTab(hypoTab);
		GameRegistry.registerBlock(blockWetrock, "Wetrock");
		GameRegistry.registerBlock(blockSlindWeed, "SlindWeed").setCreativeTab(hypoTab);
		GameRegistry.registerBlock(blockWilliWeed, "WilliWeed").setCreativeTab(hypoTab);
		GameRegistry.registerItem(ItemGodstear, "Godstear");
		GameRegistry.registerItem(ItemWoodensplinter, "WoodenSplinter");
		GameRegistry.registerItem(ItemWoodenwand, "WoodenWand");
	}
	

	@EventHandler
	public void init(FMLInitializationEvent event){
		//Proxy, TileEntity, entity, GUI and Packet registration
        FMLLog.info("Registering ReplaceHandler");
        FMLCommonHandler.instance().bus().register(new ReplaceHandler());
        MinecraftForge.EVENT_BUS.register(new ReplaceHandler());

	}
	
	public void postInit(FMLPostInitializationEvent event) {
		
		
		
		
	}
	
}
