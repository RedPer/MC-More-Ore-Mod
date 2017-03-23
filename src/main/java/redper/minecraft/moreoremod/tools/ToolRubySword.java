package redper.minecraft.moreoremod.tools;

import net.minecraft.item.ItemSword;
import redper.minecraft.moreoremod.init.ModTabs;
import redper.minecraft.moreoremod.init.ModTools;
import redper.minecraft.moreoremod.reference.ReferenceModTools;

public class ToolRubySword extends ItemSword{

	public ToolRubySword() {
		super(ReferenceModTools.RUBY_SWORD.getToolMaterial());
		
		setUnlocalizedName(ReferenceModTools.RUBY_SWORD.getUnlocalizedName());
		setRegistryName(ReferenceModTools.RUBY_SWORD.getRegistryName());
		
		setCreativeTab(ModTabs.ctDefault);
		
	}

}
