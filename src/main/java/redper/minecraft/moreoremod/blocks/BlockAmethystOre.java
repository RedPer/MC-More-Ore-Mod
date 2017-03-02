package redper.minecraft.moreoremod.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import redper.minecraft.moreoremod.Reference;
import redper.minecraft.moreoremod.init.ModItems;
import redper.minecraft.moreoremod.init.ModTabs;

public class BlockAmethystOre extends Block{

	public BlockAmethystOre() {
		super(Material.IRON);
		
		setUnlocalizedName(Reference.ModBlocksRef.AMETHYSTORE.getUnlocalizedName());
		setRegistryName(Reference.ModBlocksRef.AMETHYSTORE.getRegistryName());
		
		setHardness(3.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(ModTabs.ctDefault);
		
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Reference.OresDropsRef.AMETHYSTORE.getDrop();
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return Reference.OresDropsRef.AMETHYSTORE.getDamage();
	}
	
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		return Reference.OresDropsRef.AMETHYSTORE.getQuantity() + random.nextInt(fortune);
	}
	
}
