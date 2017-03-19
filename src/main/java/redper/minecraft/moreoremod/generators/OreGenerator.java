package redper.minecraft.moreoremod.generators;

import java.util.Random;

import com.google.common.base.Predicate;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import redper.minecraft.moreoremod.init.ModBlocks;

public class OreGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		
		switch(world.provider.getDimension()) {
		
		case -1:
			
			generateNether(world, random, chunkX, chunkZ);
			break;
			
		case 0:
			
			generateOverworld(world, random, chunkX, chunkZ);
			break;
			
		case 1:
			
			generateEnd(world, random, chunkX, chunkZ);
			break;
		
		}
		
	}

	public void generateNether(World world, Random rand, int x, int z) {
		
	}
	
	public void generateOverworld(World world, Random rand, int x, int z) {
		
		generateBlock(ModBlocks.aluminiumOre, world, rand, x, z, 2, 12, 60, 0, 100);
		generateBlock(ModBlocks.silverOre, world, rand, x, z, 2, 10, 40, 0, 80);
		generateBlock(ModBlocks.amethystOre, world, rand, x, z, 2, 8, 20, 0, 60);
		generateBlock(ModBlocks.sapphireOre, world, rand, x, z, 2, 6, 10, 0, 40);
		generateBlock(ModBlocks.rubyOre, world, rand, x, z, 2, 4, 60, 2, 10);
		
	}
	
	public void generateEnd(World world, Random rand, int x, int z) {
		
	}
	
	
	public void generateBlock(Block block, World world, Random rand, int chunkX, int chunkZ, int minVienSize, int maxVienSize, int chance, int minY, int maxY) {
		
		int vienSize = minVienSize + rand.nextInt(maxVienSize - minVienSize);
		int heigthRange = maxY - minY;
		WorldGenMinable wGenMinable = new WorldGenMinable(block.getDefaultState(), vienSize);
		
		for(int i = 0; i < chance; i++) {
			
			int xRand = chunkX * 16 + rand.nextInt(16);
			int yRand = rand.nextInt(heigthRange) + minY;
			int zRand = chunkZ * 16 + rand.nextInt(16);
			
			wGenMinable.generate(world, rand, new BlockPos(xRand, yRand, zRand));
			
		}
		
	}
	
}
