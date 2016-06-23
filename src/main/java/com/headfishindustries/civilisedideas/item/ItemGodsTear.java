package com.headfishindustries.civilisedideas.item;

import com.headfishindustries.civilisedideas.CivilisedIdeas;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemGodsTear extends Item {
	public ItemGodsTear()
	{
	setUnlocalizedName( "ci_Godstear");
	this.setTextureName("ci:Godstear");
	this.setCreativeTab(CivilisedIdeas.hypoTab);
	this.setCreativeTab(CreativeTabs.tabMisc);
	}
}
