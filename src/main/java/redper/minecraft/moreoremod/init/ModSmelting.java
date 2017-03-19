package redper.minecraft.moreoremod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmelting {

	public static void register() {
		
		GameRegistry.addSmelting(ModBlocks.aluminiumOre, new ItemStack(ModItems.aluminiumIngot), 3.0F);
		GameRegistry.addSmelting(ModBlocks.silverOre, new ItemStack(ModItems.silverIngot), 5.0F);
		GameRegistry.addSmelting(ModBlocks.amethystOre, new ItemStack(ModItems.amethyst), 6.0F);
		GameRegistry.addSmelting(ModBlocks.sapphireOre, new ItemStack(ModItems.sapphire), 7.0F);
		GameRegistry.addSmelting(ModBlocks.rubyOre, new ItemStack(ModItems.ruby), 10.0F);
		
	}
	
}
