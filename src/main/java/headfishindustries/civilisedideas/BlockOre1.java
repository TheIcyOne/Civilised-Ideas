package headfishindustries.civilisedideas;

//imports
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class BlockOre1 extends Block{
	
	public BlockOre1()	{
	super(Material.rock);
	setBlockName(CivilisedIdeas.MODID+ "_" + "martianshiny");
	setBlockTextureName(CivilisedIdeas.MODID + ":" + "martianshiny");
	setCreativeTab(CreativeTabs.tabBlock);
	}
}
