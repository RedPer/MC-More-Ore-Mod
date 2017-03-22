package redper.minecraft.moreoremod.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import redper.minecraft.moreoremod.init.ModTabs;
import redper.minecraft.moreoremod.reference.ReferenceModBlocks;
import redper.minecraft.moreoremod.reference.ReferenceOresDrop;

public class BlockSapphireOre extends Block {

	public BlockSapphireOre() {
		super(Material.IRON);
		
		setUnlocalizedName(ReferenceModBlocks.SAPPHIREORE.getUnlocalizedName());
		setRegistryName(ReferenceModBlocks.SAPPHIREORE.getRegistryName());
		
		setHardness(3.5F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(ModTabs.ctDefault);
		
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ReferenceOresDrop.SAPPHIREORE.getDrop();
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return ReferenceOresDrop.SAPPHIREORE.getDamage();
	}
	
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random rand) {
		
		if(fortune > 0)
			return ReferenceOresDrop.SAPPHIREORE.getQuantity() + rand.nextInt(fortune);
		
		return ReferenceOresDrop.SAPPHIREORE.getQuantity();
	}
	
}
