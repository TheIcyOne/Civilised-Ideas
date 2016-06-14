package headfishindustries.civilisedideas.block;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import headfishindustries.civilisedideas.CivilisedIdeas;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRedrock extends Block{

	public BlockRedrock() {
		super(Material.rock);
		setBlockName("ci_rockRed");
		setBlockTextureName("ci:rockRed");
	}
	
}
