package redper.minecraft.moreoremod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import redper.minecraft.moreoremod.Reference;

public class BlockAmethystOre extends Block{

	public BlockAmethystOre() {
		super(Material.IRON);
		
		setUnlocalizedName(Reference.ModBlocksRef.AMETHYSTORE.getUnlocalizedName());
		setRegistryName(Reference.ModBlocksRef.AMETHYSTORE.getRegistryName());
		
		setHardness(3.0F);
		
	}

}
