package headfishindustries.civilisedideas;

//imports
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class BlockOre1 extends Block{
	
	private final String name = "BlockOre1";
	
	public BlockOre1()	{
	super(Material.rock);
	setUnlocalizedName(instance.MODID+ "_" + "martianshiny");
	setCreativeTab(CreativeTabs.tabBlock);
	}
	public String getName()
	{
	return name;
	}
}
