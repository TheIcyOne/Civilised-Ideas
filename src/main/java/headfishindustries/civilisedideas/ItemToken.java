package headfishindustries.civilisedideas;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class ItemToken extends Item {
	public ItemToken(){
	this.setMaxStackSize(64);	
	this.setCreativeTab(CreativeTabs.tabMisc);
	this.setUnlocalizedName("itemToken");
	}
}
