package redper.minecraft.moreoremod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.aluminiumBlock), "AAA", "AAA", "AAA", 'A', ModItems.aluminiumIngot);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.silverBlock), "SSS", "SSS", "SSS", 'S', ModItems.silverIngot);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.amethystBlock), "AAA", "AAA", "AAA", 'A', ModItems.amethyst);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.sapphireBlock), "SSS", "SSS", "SSS", 'S', ModItems.sapphire);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.rubyBlock), "RRR", "RRR", "RRR", 'R', ModItems.ruby);
		
	}
	
}
