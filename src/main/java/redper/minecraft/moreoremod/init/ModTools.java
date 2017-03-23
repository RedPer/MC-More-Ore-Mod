package redper.minecraft.moreoremod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import redper.minecraft.moreoremod.tools.*;

public class ModTools {

	public static Item rubySword;
	public static Item.ToolMaterial materialRuby;
	
	public static void init() {
		
		rubySword = new ToolRubySword();
		
	}
	
	public static void initMaterials() {
		
		materialRuby = EnumHelper.addToolMaterial("materialRuby", 4, 4450, 22.0F, 16.0F, 28);
		
	}
	
	public static void register() {
		
		GameRegistry.register(rubySword);
		
	}
	
	public static void registerRenders() {
		
		registerRender(rubySword);
		
	}
	
	private static void registerRender(Item item) {
				
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
	}
}
