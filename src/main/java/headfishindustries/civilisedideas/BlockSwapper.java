package headfishindustries.civilisedideas;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSwapper extends Block {

	public BlockSwapper(Material material) {
	super(material);
	this.setResistance(10.0F);
	this.setHardness(3F);
	this.setHarvestLevel("pickaxe",2);
	this.setLightLevel(0.7F);
	this.setLightOpacity(5);
	}
	
	
	
}


