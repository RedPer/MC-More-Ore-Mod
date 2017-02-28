package redper.minecraft.moreoremod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import redper.minecraft.moreoremod.Reference;

public class BlockAluminiumOre extends Block {

	public BlockAluminiumOre() {
		super(Material.IRON);
	
		setUnlocalizedName(Reference.ModBlocksRef.ALUMINIUMORE.getUnlocalizedName());
		setRegistryName(Reference.ModBlocksRef.ALUMINIUMORE.getRegistryName());
		
		setHardness(2.0F);
		
	}
	
}
