package redper.minecraft.moreoremod.items;

import net.minecraft.item.Item;
import redper.minecraft.moreoremod.init.ModTabs;
import redper.minecraft.moreoremod.reference.ReferenceModItems;

public class ItemRuby extends Item{

	public ItemRuby() {

		setUnlocalizedName(ReferenceModItems.RUBY.getUnlocalizedName());
		setRegistryName(ReferenceModItems.RUBY.getRegistryName());
		
		setCreativeTab(ModTabs.ctDefault);
		
	}
		
}
