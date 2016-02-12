package headfishindustries.pvptools;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPressurePlate;

import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class blockMine extends Block{
	


	public blockMine(Material material) {
		super(material);
		this.setResistance(10.0F);
		this.setHardness(0F);
		this.setHarvestLevel("shear",0);
		this.setLightLevel(0.4F);
		this.setLightOpacity(0);
	}
	
	@Override
	public boolean isOpaqueCube(){
		
		return false;

	}
	
	
	@Override
	public void onEntityWalking(World world, int x, int y, int z, Entity entity){
		System.out.println(entity + " stepped on a mine.");
		explodeWithoutBlockDamage(world, entity, (double)x, (double)y, (double)z, 8F);
		world.setBlockToAir(x, y, z);
		
	}
	
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z){
		return null;
	}
	
	
	public Explosion explodeWithoutBlockDamage(World world, Entity entity, double explosionX, double explosionY, double explosionZ, float f){
			Explosion explosion = new Explosion(world, entity, explosionX, explosionY, explosionZ, f);
		    explosion.doExplosionA();
		    System.out.println("Made a boom boom.");
		    world.playSoundEffect(explosionX, explosionY, explosionZ, "random.explode", 4F, (1.0F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.2F) * 0.7F);
		    entity.attackEntityFrom(DamageSource.setExplosionSource(explosion), f);
		    world.spawnParticle("hugeExplosion", explosionX, explosionY, explosionZ, 0.0D, 0.0D, 0.0D);
		    return explosion;
	}
}
