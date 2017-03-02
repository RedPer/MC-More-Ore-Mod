package redper.minecraft.moreoremod.items;

import net.minecraft.item.Item;
import redper.minecraft.moreoremod.Reference;
import redper.minecraft.moreoremod.init.ModTabs;

public class ItemSilver extends Item {

	public ItemSilver() {
		
		setUnlocalizedName(Reference.ModItemsRef.SILVER.getUnlocalizedName());
		setRegistryName(Reference.ModItemsRef.SILVER.getRegistryName());
		
		setCreativeTab(ModTabs.ctDefault);
		
	}
	
}
