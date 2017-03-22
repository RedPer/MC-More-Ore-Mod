package redper.minecraft.moreoremod.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import redper.minecraft.moreoremod.init.ModTabs;
import redper.minecraft.moreoremod.reference.ReferenceModBlocks;
import redper.minecraft.moreoremod.reference.ReferenceOresDrop;

public class BlockRubyOre extends Block{

	public BlockRubyOre() {
		super(Material.IRON);
		
		setUnlocalizedName(ReferenceModBlocks.RUBYORE.getUnlocalizedName());
		setRegistryName(ReferenceModBlocks.RUBYORE.getRegistryName());
		
		setHardness(5.0F);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(ModTabs.ctDefault);
		
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ReferenceOresDrop.RUBYORE.getDrop();
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return ReferenceOresDrop.RUBYORE.getDamage();
	}
	
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random rand) {
		
		if(fortune > 0)
			return ReferenceOresDrop.RUBYORE.getQuantity() + rand.nextInt(fortune);
		
		return ReferenceOresDrop.RUBYORE.getQuantity();
	}
	
}
