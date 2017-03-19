package redper.minecraft.moreoremod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import redper.minecraft.moreoremod.Reference;
import redper.minecraft.moreoremod.init.ModTabs;

public class BlockSilver extends Block {

	public BlockSilver() {
		super(Material.IRON);
		
		setUnlocalizedName(Reference.ModBlocksRef.SILVERBLOCK.getUnlocalizedName());
		setRegistryName(Reference.ModBlocksRef.SILVERBLOCK.getRegistryName());
		
		setHardness(3.0F);
		setHarvestLevel("pickaxe", 1);
		setCreativeTab(ModTabs.ctDefault);
		
	}

}
