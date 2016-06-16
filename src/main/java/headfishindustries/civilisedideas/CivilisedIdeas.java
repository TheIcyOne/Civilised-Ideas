package headfishindustries.civilisedideas;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import headfishindustries.civilisedideas.block.BlockBonerock;
import headfishindustries.civilisedideas.block.BlockRedrock;
import headfishindustries.civilisedideas.block.BlockSlindWeed;
import headfishindustries.civilisedideas.block.BlockWetrock;
import headfishindustries.civilisedideas.block.BlockWilliWeed;
import headfishindustries.civilisedideas.item.ItemGodstear;
import headfishindustries.civilisedideas.item.ItemWoodenSplinter;
import headfishindustries.civilisedideas.item.ItemWoodenWand;
import headfishindustries.civilisedideas.commands.GetDim;
import net.minecraft.block.Block;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid="ci",modLanguage = "java", name="Civilised Ideas", version="1.0")

public class CivilisedIdeas {
	
	@Instance(value = "ci")
	public static CivilisedIdeas instance;
	
	public static Block blockRedrock = new BlockRedrock();
	public static Block blockWetrock = new BlockWetrock();
	public static Block blockBonerock = new BlockBonerock();
	public static Block blockWilliWeed = new BlockWilliWeed();
	public static Block blockSlindWeed = new BlockSlindWeed();
	public static Item ItemGodstear = new ItemGodstear();
	public static Item ItemWoodensplinter = new ItemWoodenSplinter();
	public static Item ItemWoodenwand = new ItemWoodenWand();
	
	//public static Item itemGrapple;

	//public static Entity entityGrapple;
	
	public static CreativeTabs hypoTab = new CreativeTabs("Hypovolemia"){
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return new ItemStack(blockBonerock).getItem();
		}	
	};
	
	@EventHandler
	public void serverStarting(FMLServerStartingEvent event){
		ICommandManager cmdManage = event.getServer().getCommandManager();
		ServerCommandManager svrCommandManage = ((ServerCommandManager)cmdManage);
		svrCommandManage.registerCommand(new GetDim());
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
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
	
		
	}
	
	public void postInit(FMLPostInitializationEvent event) {
		
		
		
		
	}
	
}
