package redper.minecraft.moreoremod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import redper.minecraft.moreoremod.init.ModTabs;
import redper.minecraft.moreoremod.reference.ReferenceModBlocks;

public class BlockAmethyst extends Block {

	public BlockAmethyst() {
		super(Material.IRON);
		
		setUnlocalizedName(ReferenceModBlocks.AMETHYSTBLOCK.getUnlocalizedName());
		setRegistryName(ReferenceModBlocks.AMETHYSTBLOCK.getRegistryName());
		
		setHardness(3.5F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(ModTabs.ctDefault);
		
	}

}
