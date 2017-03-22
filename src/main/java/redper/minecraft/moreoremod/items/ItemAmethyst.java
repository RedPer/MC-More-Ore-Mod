package redper.minecraft.moreoremod.items;

import net.minecraft.item.Item;
import redper.minecraft.moreoremod.init.ModTabs;
import redper.minecraft.moreoremod.reference.ReferenceModItems;

public class ItemAmethyst extends Item {

	public ItemAmethyst() {

		setUnlocalizedName(ReferenceModItems.AMETHYST.getUnlocalizedName());
		setRegistryName(ReferenceModItems.AMETHYST.getRegistryName());
		
		setCreativeTab(ModTabs.ctDefault);
	
	}
	
}
