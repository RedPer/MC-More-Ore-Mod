package redper.minecraft.moreoremod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import redper.minecraft.moreoremod.Reference;
import redper.minecraft.moreoremod.init.ModTabs;

public class BlockAmethyst extends Block {

	public BlockAmethyst() {
		super(Material.IRON);
		
		setUnlocalizedName(Reference.ModBlocksRef.AMETHYSTBLOCK.getUnlocalizedName());
		setRegistryName(Reference.ModBlocksRef.AMETHYSTBLOCK.getRegistryName());
		
		setHardness(3.5F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(ModTabs.ctDefault);
		
	}

}
