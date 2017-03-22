package redper.minecraft.moreoremod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import redper.minecraft.moreoremod.init.ModTabs;
import redper.minecraft.moreoremod.reference.ReferenceModBlocks;

public class BlockSilver extends Block {

	public BlockSilver() {
		super(Material.IRON);
		
		setUnlocalizedName(ReferenceModBlocks.SILVERBLOCK.getUnlocalizedName());
		setRegistryName(ReferenceModBlocks.SILVERBLOCK.getRegistryName());
		
		setHardness(3.0F);
		setHarvestLevel("pickaxe", 1);
		setCreativeTab(ModTabs.ctDefault);
		
	}

}
