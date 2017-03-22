package redper.minecraft.moreoremod.reference;

public enum ReferenceModBlocks {

	ALUMINIUMORE("aluminiumOre", "aluminium_ore"),
	SILVERORE("silverOre", "silver_ore"),
	AMETHYSTORE("amethystOre", "amethyst_ore"),
	SAPPHIREORE("sapphireOre", "sapphire_ore"),
	RUBYORE("rubyOre", "ruby_ore"),
	
	ALUMINIUMBLOCK("aluminiumBlock", "aluminium_block"),
	SILVERBLOCK("silverBlock", "silver_block"),
	AMETHYSTBLOCK("amethystBlock", "amethyst_block"),
	SAPPHIREBLOCK("sapphireBlock", "sapphire_block"),
	RUBYBLOCK("rubyBlock", "ruby_block");
	
	private String unlocalizedName;
	private String registryName;
	
	private ReferenceModBlocks(String unlocalizedName, String registryName) {
		
		this.unlocalizedName = unlocalizedName;
		this.registryName = registryName;
		
	}
	
	public String getUnlocalizedName() {
		return unlocalizedName;
	}
	
	public String getRegistryName() {
		return registryName;
	}
	
}
