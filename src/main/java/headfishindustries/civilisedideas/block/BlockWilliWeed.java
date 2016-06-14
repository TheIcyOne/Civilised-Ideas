package headfishindustries.civilisedideas.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockWilliWeed extends BlockFlower {
	
	private IIcon icon;

	public BlockWilliWeed() {
		super(0);
		setBlockName("ci_flowerWilliWeed");
		setHardness(0.2F);
		setStepSound(soundTypeGrass);
		setTickRandomly(false);
		setBlockBounds(0.1F, 0.0F, 0.1F, 0.9F, 0.9F, 0.9F);
		setBlockTextureName("ci:WilliWeed");
	}
		
	 @SideOnly(Side.CLIENT)
	   public IIcon getIcon(int par1, int par2){
		   return this.icon;
	   }
	   
	   @SideOnly(Side.CLIENT)
	   public void registerBlockIcons(IIconRegister par1){
		   this.icon = par1.registerIcon("ci:williWeed");
		   
	   }
	
	   public boolean isOpaqueCube() {
	       return false;
	   }


}
