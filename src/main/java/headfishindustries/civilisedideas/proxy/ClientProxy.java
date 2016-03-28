package headfishindustries.civilisedideas.proxy;

import headfishindustries.civilisedideas.init.CivilisedItems;


public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenders(){
		CivilisedItems.registerRenders();
	}
}
