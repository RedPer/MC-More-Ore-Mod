package redper.minecraft.moreoremod.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import redper.minecraft.moreoremod.blocks.*;

public class ModBlocks {

	public static Block aluminiumOre;
	public static Block silverOre;
	public static Block amethystOre;
	public static Block sapphireOre;
	public static Block rubyOre;
	
	public static void init() {
	
		aluminiumOre = new BlockAluminiumOre();
		silverOre = new BlockSilverOre();
		amethystOre = new BlockAmethystOre();
		sapphireOre = new BlockSapphireOre();
		rubyOre = new BlockRubyOre();
		
	}
	
	public static void register() {
		
		registerBlock(aluminiumOre);
		registerBlock(silverOre);
		registerBlock(amethystOre);
		registerBlock(sapphireOre);
		registerBlock(rubyOre);
		
	}
	
	private static void registerBlock(Block block) {
		
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setUnlocalizedName(block.getUnlocalizedName());
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
		
	}
	
	public static void registerRenders() {
		
		registerRender(aluminiumOre);
		registerRender(silverOre);
		registerRender(amethystOre);
		registerRender(sapphireOre);
		registerRender(rubyOre);
		
	}
	
	private static void registerRender(Block block) {
				
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
		
	}
	
}
