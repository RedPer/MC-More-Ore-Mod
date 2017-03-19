package redper.minecraft.moreoremod.blocks;

import java.util.Random;

import javax.swing.JOptionPane;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import redper.minecraft.moreoremod.Reference;
import redper.minecraft.moreoremod.init.ModItems;
import redper.minecraft.moreoremod.init.ModTabs;

public class BlockSapphireOre extends Block {

	public BlockSapphireOre() {
		super(Material.IRON);
		
		setUnlocalizedName(Reference.ModBlocksRef.SAPPHIREORE.getUnlocalizedName());
		setRegistryName(Reference.ModBlocksRef.SAPPHIREORE.getRegistryName());
		
		setHardness(3.5F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(ModTabs.ctDefault);
		
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Reference.OresDropsRef.SAPPHIREORE.getDrop();
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return Reference.OresDropsRef.SAPPHIREORE.getDamage();
	}
	
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random rand) {
		
		if(fortune > 0)
			return Reference.OresDropsRef.SAPPHIREORE.getQuantity() + rand.nextInt(fortune);
		
		return Reference.OresDropsRef.SAPPHIREORE.getQuantity();
	}
	
}
