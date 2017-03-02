package redper.minecraft.moreoremod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import redper.minecraft.moreoremod.Reference;
import redper.minecraft.moreoremod.init.ModTabs;

public class BlockSilverOre extends Block {

	public BlockSilverOre() {
		super(Material.IRON);
		
		setUnlocalizedName(Reference.ModBlocksRef.SILVERORE.getUnlocalizedName());
		setRegistryName(Reference.ModBlocksRef.SILVERORE.getRegistryName());
		
		setHardness(2.5F);
		setHarvestLevel("pickaxe", 1);
		setCreativeTab(ModTabs.ctDefault);
		
	}

}
