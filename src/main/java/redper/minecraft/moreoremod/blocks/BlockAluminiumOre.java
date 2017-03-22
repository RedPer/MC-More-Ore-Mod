package redper.minecraft.moreoremod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import redper.minecraft.moreoremod.init.ModTabs;
import redper.minecraft.moreoremod.reference.ReferenceModBlocks;

public class BlockAluminiumOre extends Block {

	public BlockAluminiumOre() {
		super(Material.IRON);
	
		setUnlocalizedName(ReferenceModBlocks.ALUMINIUMORE.getUnlocalizedName());
		setRegistryName(ReferenceModBlocks.ALUMINIUMORE.getRegistryName());
		
		setHardness(2.0F);
		setHarvestLevel("pickaxe", 1);
		setCreativeTab(ModTabs.ctDefault);
		
	}
	
}
