package redper.minecraft.moreoremod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import redper.minecraft.moreoremod.init.ModTabs;
import redper.minecraft.moreoremod.reference.ReferenceModBlocks;

public class BlockAluminium extends Block {

	public BlockAluminium() {
		super(Material.IRON);
		
		setUnlocalizedName(ReferenceModBlocks.ALUMINIUMBLOCK.getUnlocalizedName());
		setRegistryName(ReferenceModBlocks.ALUMINIUMBLOCK.getRegistryName());
		
		setHardness(2.5F);
		setHarvestLevel("pickaxe", 1);
		setCreativeTab(ModTabs.ctDefault);
		
	}

}
