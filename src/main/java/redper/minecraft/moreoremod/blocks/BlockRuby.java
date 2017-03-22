package redper.minecraft.moreoremod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import redper.minecraft.moreoremod.init.ModTabs;
import redper.minecraft.moreoremod.reference.ReferenceModBlocks;

public class BlockRuby extends Block {

	public BlockRuby() {
		super(Material.IRON);
		
		setUnlocalizedName(ReferenceModBlocks.RUBYBLOCK.getUnlocalizedName());
		setRegistryName(ReferenceModBlocks.RUBYBLOCK.getRegistryName());
		
		setHardness(6.0F);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(ModTabs.ctDefault);
		
	}

}
