package redper.minecraft.moreoremod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import redper.minecraft.moreoremod.Reference;
import redper.minecraft.moreoremod.init.ModTabs;

public class BlockAluminium extends Block {

	public BlockAluminium() {
		super(Material.IRON);
		
		setUnlocalizedName(Reference.ModBlocksRef.ALUMINIUMBLOCK.getUnlocalizedName());
		setRegistryName(Reference.ModBlocksRef.ALUMINIUMBLOCK.getRegistryName());
		
		setHardness(2.5F);
		setHarvestLevel("pickaxe", 1);
		setCreativeTab(ModTabs.ctDefault);
		
	}

}
