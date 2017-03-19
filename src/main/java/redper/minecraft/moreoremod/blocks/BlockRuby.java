package redper.minecraft.moreoremod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import redper.minecraft.moreoremod.Reference;
import redper.minecraft.moreoremod.init.ModTabs;

public class BlockRuby extends Block {

	public BlockRuby() {
		super(Material.IRON);
		
		setUnlocalizedName(Reference.ModBlocksRef.RUBYBLOCK.getUnlocalizedName());
		setRegistryName(Reference.ModBlocksRef.RUBYBLOCK.getRegistryName());
		
		setHardness(6.0F);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(ModTabs.ctDefault);
		
	}

}
