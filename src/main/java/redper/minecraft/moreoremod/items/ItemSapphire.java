package redper.minecraft.moreoremod.items;

import net.minecraft.item.Item;
import redper.minecraft.moreoremod.Reference;
import redper.minecraft.moreoremod.init.ModTabs;

public class ItemSapphire extends Item {

	public ItemSapphire() {

		setUnlocalizedName(Reference.ModItemsRef.SAPPHIRE.getUnlocalizedName());
		setRegistryName(Reference.ModItemsRef.SAPPHIRE.getRegistryName());
		
		setCreativeTab(ModTabs.ctDefault);
	
	}
	
}
