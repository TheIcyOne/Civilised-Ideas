package headfishindustries.civilisedideas.tab;

import headfishindustries.civilisedideas.CivilisedIdeas;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class HypoTab extends CreativeTabs{
	
	public HypoTab(int id, String name){
		super(id, name);
	}
	
	@Override
	public Item getTabIconItem(){
		return CivilisedIdeas.ItemWoodensplinter;
	}
}
