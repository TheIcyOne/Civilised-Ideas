package headfishindustries.civilisedideas.entities;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntityGrapple extends EntityArrow{
	

	public EntityGrapple(World world, Double x, Double y, Double z, Float pitch, Float yaw) {
		super(world);
		this.isImmuneToFire = true;
	}

	@Override
	protected void entityInit() {
		
		
	}

	
	@Override
	 public void onEntityUpdate(){	
		
		int x = (int)this.posX;
		int y = (int)this.posY;
		int z = (int)this.posZ;
		Block block = this.worldObj.getBlock( x, y, z);

        if (block.getMaterial() != Material.air)
        {
            block.setBlockBoundsBasedOnState(this.worldObj, x, y, z);
            AxisAlignedBB axisalignedbb = block.getCollisionBoundingBoxFromPool(this.worldObj, x, y, z);

            if (axisalignedbb != null && axisalignedbb.isVecInside(Vec3.createVectorHelper(this.posX, this.posY, this.posZ)))
            {
                this.setDead();
            }
		super.onEntityUpdate();		
	}
	
	
}
}
