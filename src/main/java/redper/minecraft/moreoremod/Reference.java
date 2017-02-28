package redper.minecraft.moreoremod;

public class Reference {

	public static final String MOD_ID = "redpermoreoremod";
	public static final String NAME = "More Ore Mod";
	public static final String VERSION = "1.0";
	public static final String MC_VERSIONS = "[1.11.2]";
	
	public static final String CLIENT_PROXY_CLASS = "redper.minecraft.moreoremod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "redper.minecraft.moreoremod.proxy.ServerProxy";
	
	public static enum ModItemsRef {
		
		ALUMINIUM("aluminiumIngot", "aluminium_ingot"),
		SILVER("silverIngot", "silver_ingot"),
		AMETHYST("amethyst", "amethyst"),
		SAPPHIRE("sapphire", "sapphire"),
		RUBY("ruby", "ruby");
		
		private String unlocalizedName;
		private String registryName;
		
		private ModItemsRef(String unlocalizedName, String registryName) {
			
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
	
	public static enum ModBlocksRef {
		
		ALUMINIUMORE("aluminiumOre", "aluminium_ore"),
		SILVERORE("silverOre", "silver_ore"),
		AMETHYSTORE("amethystOre", "amethyst_ore"),
		SAPPHIREORE("sapphireOre", "sapphire_ore"),
		RUBYORE("rubyOre", "ruby_ore");
		
		private String unlocalizedName;
		private String registryName;
		
		private ModBlocksRef(String unlocalizedName, String registryName) {
			
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
	
}
