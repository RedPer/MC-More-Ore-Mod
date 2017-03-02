package redper.minecraft.moreoremod.items;

import net.minecraft.item.Item;
import redper.minecraft.moreoremod.Reference;
import redper.minecraft.moreoremod.init.ModTabs;

public class ItemAmethyst extends Item {

	public ItemAmethyst() {

		setUnlocalizedName(Reference.ModItemsRef.AMETHYST.getUnlocalizedName());
		setRegistryName(Reference.ModItemsRef.AMETHYST.getRegistryName());
		
		setCreativeTab(ModTabs.ctDefault);
	
	}
	
}
