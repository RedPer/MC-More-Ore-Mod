package redper.minecraft.moreoremod.reference;

import net.minecraft.item.Item;
import redper.minecraft.moreoremod.init.ModTools;

public enum ReferenceModTools {

	RUBY_SWORD("rubySword", "ruby_sword", ModTools.materialRuby);
	
	private String unlocalizedName;
	private String registryName;
	private Item.ToolMaterial toolMaterial;
	
	private ReferenceModTools(String unlocalizedName, String registryName, Item.ToolMaterial toolMaterial) {
		
		this.unlocalizedName = unlocalizedName;
		this.registryName = registryName;
		this.toolMaterial = toolMaterial;
		
	}
	
	public String getUnlocalizedName() {
		return unlocalizedName;
	}
	
	public String getRegistryName() {
		return registryName;
	}
	
	public Item.ToolMaterial getToolMaterial() {
		return toolMaterial;
	}
	
}
