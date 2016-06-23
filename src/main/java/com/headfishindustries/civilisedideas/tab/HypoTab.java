package com.headfishindustries.civilisedideas.tab;

import com.headfishindustries.civilisedideas.CivilisedIdeas;

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
