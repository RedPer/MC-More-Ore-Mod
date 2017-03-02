package redper.minecraft.moreoremod.items;

import net.minecraft.item.Item;
import redper.minecraft.moreoremod.Reference;
import redper.minecraft.moreoremod.init.ModTabs;

public class ItemAluminium extends Item {

	public ItemAluminium() {
		
		setUnlocalizedName(Reference.ModItemsRef.ALUMINIUM.getUnlocalizedName());
		setRegistryName(Reference.ModItemsRef.ALUMINIUM.getRegistryName());
		
		setCreativeTab(ModTabs.ctDefault);
		
	}
	
}
