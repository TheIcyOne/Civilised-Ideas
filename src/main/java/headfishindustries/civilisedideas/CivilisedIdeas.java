package headfishindustries.civilisedideas;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.registry.GameRegistry;
import headfishindustries.civilisedideas.commands.GetDim;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemCoal;
import net.minecraft.item.ItemStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;


@instance 
@Mod(modid = instance.MODID, version = instance.VERSION, name= instance.NAME , modLanguage = instance.MODLANGUAGE)
public class CivilisedIdeas {


    private static final String MODID = null;
	public static Block Blockore1;{
    
	 
	//if(FMLCommonHandler.instance().getEffectiveSide()==Side.CLIENT)
	{
	//RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();

	//renderItem.getItemModelMesher().register(Blockore1, 0, new ModelResourceLocation(CivilisedIdeas.MODID + ":" + ((BlockOre1) BlockOre1).getName(), "inventory"));

	}
    }
    
    //
    
	@Instance(value = "CivilisedIdeas")
	public static CivilisedIdeas instance;
		


	
	@EventHandler
	public void serverStarting(FMLServerStartingEvent event){
		ICommandManager cmdManage = event.getServer().getCommandManager();
		ServerCommandManager svrCommandManage = ((ServerCommandManager)cmdManage);
		svrCommandManage.registerCommand(new GetDim());
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//Block and Item Initialization
//		itemGrapple = new ItemGrapple();
    //	FMLCommonHandler.instance().bus().register(handler);
    //	MinecraftForge.EVENT_BUS.register(handler);
    	Blockore1 = new BlockOre1();
        
    	GameRegistry.registerBlock(Blockore1, "Blockore1");
		
		

	}
	

	@EventHandler
	public void init(FMLInitializationEvent event){
		//Proxy, TileEntity, entity, GUI and Packet registration
	
		
	}
	
	public void postInit(FMLPostInitializationEvent event) {
		
		
		
		
	
	if(event.getSide() == Side.CLIENT)
	{
	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();

	//blocks
	renderItem.getItemModelMesher().register(Item.getItemFromBlock(Blockore1), 0, new ModelResourceLocation(instance.MODID + ":" + ((BlockOre1) Blockore1).getName(), "inventory"));

	}
}
}


