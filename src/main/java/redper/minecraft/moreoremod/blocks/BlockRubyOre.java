package redper.minecraft.moreoremod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import redper.minecraft.moreoremod.Reference;

public class BlockRubyOre extends Block{

	public BlockRubyOre() {
		super(Material.IRON);
		
		setUnlocalizedName(Reference.ModBlocksRef.RUBYORE.getUnlocalizedName());
		setRegistryName(Reference.ModBlocksRef.RUBYORE.getRegistryName());
		
		setHardness(5.0F);
		
	}

}
