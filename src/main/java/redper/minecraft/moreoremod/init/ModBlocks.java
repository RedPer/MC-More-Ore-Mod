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
	
	public static Block aluminiumBlock;
	public static Block silverBlock;
	public static Block amethystBlock;
	public static Block sapphireBlock;
	public static Block rubyBlock;
	
	public static void init() {
	
		aluminiumOre = new BlockAluminiumOre();
		silverOre = new BlockSilverOre();
		amethystOre = new BlockAmethystOre();
		sapphireOre = new BlockSapphireOre();
		rubyOre = new BlockRubyOre();
		
		aluminiumBlock = new BlockAluminium();
		silverBlock = new BlockSilver();
		amethystBlock = new BlockAmethyst();
		sapphireBlock = new BlockSapphire();
		rubyBlock = new BlockRuby();
		
	}
	
	public static void register() {
		
		registerBlock(aluminiumOre);
		registerBlock(silverOre);
		registerBlock(amethystOre);
		registerBlock(sapphireOre);
		registerBlock(rubyOre);
		
		registerBlock(aluminiumBlock);
		registerBlock(silverBlock);
		registerBlock(amethystBlock);
		registerBlock(sapphireBlock);
		registerBlock(rubyBlock);
		
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
		
		registerRender(aluminiumBlock);
		registerRender(silverBlock);
		registerRender(amethystBlock);
		registerRender(sapphireBlock);
		registerRender(rubyBlock);
		
		
	}
	
	private static void registerRender(Block block) {
				
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
		
	}
	
}
