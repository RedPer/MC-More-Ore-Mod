package redper.minecraft.moreoremod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import redper.minecraft.moreoremod.Reference;
import redper.minecraft.moreoremod.init.ModTabs;

public class ItemRuby extends Item{

	public ItemRuby() {

		setUnlocalizedName(Reference.ModItemsRef.RUBY.getUnlocalizedName());
		setRegistryName(Reference.ModItemsRef.RUBY.getRegistryName());
		
		setCreativeTab(ModTabs.ctDefault);
		
	}
		
}
