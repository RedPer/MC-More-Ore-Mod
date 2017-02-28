package redper.minecraft.moreoremod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import redper.minecraft.moreoremod.Reference;

public class BlockSapphireOre extends Block{

	public BlockSapphireOre() {
		super(Material.IRON);
		
		setUnlocalizedName(Reference.ModBlocksRef.SAPPHIREORE.getUnlocalizedName());
		setRegistryName(Reference.ModBlocksRef.SAPPHIREORE.getRegistryName());
		
		setHardness(3.5F);
		
	}
	
}
