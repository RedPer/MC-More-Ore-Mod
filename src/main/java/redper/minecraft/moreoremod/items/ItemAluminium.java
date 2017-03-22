package redper.minecraft.moreoremod.items;

import net.minecraft.item.Item;
import redper.minecraft.moreoremod.init.ModTabs;
import redper.minecraft.moreoremod.reference.ReferenceModItems;

public class ItemAluminium extends Item {

	public ItemAluminium() {
		
		setUnlocalizedName(ReferenceModItems.ALUMINIUM.getUnlocalizedName());
		setRegistryName(ReferenceModItems.ALUMINIUM.getRegistryName());
		
		setCreativeTab(ModTabs.ctDefault);
		
	}
	
}
