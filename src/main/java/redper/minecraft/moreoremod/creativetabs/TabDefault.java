package redper.minecraft.moreoremod.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import redper.minecraft.moreoremod.init.ModBlocks;

public class TabDefault extends CreativeTabs {

	public TabDefault() {
		super("tabDefault");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModBlocks.rubyOre);
	}

}
