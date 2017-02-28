package redper.minecraft.moreoremod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import redper.minecraft.moreoremod.items.*;

public class ModItems {

	public static Item aluminiumIngot;
	public static Item silverIngot;
	public static Item amethyst;
	public static Item sapphire;
	public static Item ruby;
	
	public static void init() {
		
		aluminiumIngot = new ItemAluminium();
		silverIngot = new ItemSilver();
		amethyst = new ItemAmethyst();
		sapphire = new ItemSapphire();
		ruby = new ItemRuby();
		
	}
	
	public static void register() {
		
		GameRegistry.register(aluminiumIngot);
		GameRegistry.register(silverIngot);
		GameRegistry.register(amethyst);
		GameRegistry.register(sapphire);
		GameRegistry.register(ruby);
		
		
	}
	
	public static void registerRenders() {
		
		registerRender(aluminiumIngot);
		registerRender(silverIngot);
		registerRender(amethyst);
		registerRender(sapphire);
		registerRender(ruby);
		
	}
	
	private static void registerRender(Item item) {
				
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
	}
}
