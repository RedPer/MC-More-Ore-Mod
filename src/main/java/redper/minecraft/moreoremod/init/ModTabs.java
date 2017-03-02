package redper.minecraft.moreoremod.init;

import net.minecraft.creativetab.CreativeTabs;
import redper.minecraft.moreoremod.creativetabs.*;

public class ModTabs {

	public static CreativeTabs ctDefault;
	
	public static void init() {
		
		ctDefault = new TabDefault();
		
	}
	
}
