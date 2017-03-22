package redper.minecraft.moreoremod.reference;

public enum ReferenceModItems {

	ALUMINIUM("aluminiumIngot", "aluminium_ingot"),
	SILVER("silverIngot", "silver_ingot"),
	AMETHYST("amethyst", "amethyst"),
	SAPPHIRE("sapphire", "sapphire"),
	RUBY("ruby", "ruby");
	
	private String unlocalizedName;
	private String registryName;
	
	private ReferenceModItems(String unlocalizedName, String registryName) {
		
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
