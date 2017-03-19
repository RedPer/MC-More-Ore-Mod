package redper.minecraft.moreoremod.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import redper.minecraft.moreoremod.Reference;
import redper.minecraft.moreoremod.init.ModTabs;

public class BlockRubyOre extends Block{

	public BlockRubyOre() {
		super(Material.IRON);
		
		setUnlocalizedName(Reference.ModBlocksRef.RUBYORE.getUnlocalizedName());
		setRegistryName(Reference.ModBlocksRef.RUBYORE.getRegistryName());
		
		setHardness(5.0F);
		setHarvestLevel("pickaxe", 3);
		setCreativeTab(ModTabs.ctDefault);
		
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Reference.OresDropsRef.RUBYORE.getDrop();
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return Reference.OresDropsRef.RUBYORE.getDamage();
	}
	
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random rand) {
		
		if(fortune > 0)
			return Reference.OresDropsRef.RUBYORE.getQuantity() + rand.nextInt(fortune);
		
		return Reference.OresDropsRef.RUBYORE.getQuantity();
	}
	
}
