package redper.minecraft.moreoremod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import redper.minecraft.moreoremod.init.ModTabs;
import redper.minecraft.moreoremod.reference.ReferenceModBlocks;

public class BlockSapphire extends Block {

	public BlockSapphire() {
		super(Material.IRON);
		
		setUnlocalizedName(ReferenceModBlocks.SAPPHIREBLOCK.getUnlocalizedName());
		setRegistryName(ReferenceModBlocks.SAPPHIREBLOCK.getRegistryName());
		
		setHardness(4.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(ModTabs.ctDefault);
		
	}

}
