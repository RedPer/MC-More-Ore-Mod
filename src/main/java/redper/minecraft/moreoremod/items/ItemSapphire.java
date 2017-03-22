package redper.minecraft.moreoremod.items;

import net.minecraft.item.Item;
import redper.minecraft.moreoremod.init.ModTabs;
import redper.minecraft.moreoremod.reference.ReferenceModItems;

public class ItemSapphire extends Item {

	public ItemSapphire() {

		setUnlocalizedName(ReferenceModItems.SAPPHIRE.getUnlocalizedName());
		setRegistryName(ReferenceModItems.SAPPHIRE.getRegistryName());
		
		setCreativeTab(ModTabs.ctDefault);
	
	}
	
}
