package redper.minecraft.moreoremod.items;

import net.minecraft.item.Item;
import redper.minecraft.moreoremod.init.ModTabs;
import redper.minecraft.moreoremod.reference.ReferenceModItems;

public class ItemSilver extends Item {

	public ItemSilver() {
		
		setUnlocalizedName(ReferenceModItems.SILVER.getUnlocalizedName());
		setRegistryName(ReferenceModItems.SILVER.getRegistryName());
		
		setCreativeTab(ModTabs.ctDefault);
		
	}
	
}
