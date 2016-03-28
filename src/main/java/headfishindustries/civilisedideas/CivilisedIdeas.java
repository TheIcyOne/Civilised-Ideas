package headfishindustries.civilisedideas;

import headfishindustries.civilisedideas.init.CivilisedItems;
import headfishindustries.civilisedideas.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION)

public class CivilisedIdeas{
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		CivilisedItems.init();
		CivilisedItems.register();
	}
	@EventHandler
	public void Init(FMLInitializationEvent event){
		proxy.registerRenders();
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){

}
}