package redper.minecraft.moreoremod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.*;
import redper.minecraft.moreoremod.init.*;
import redper.minecraft.moreoremod.proxy.IProxy;
import redper.minecraft.moreoremod.reference.*;

@Mod(modid = ReferenceMod.MOD_ID, name = ReferenceMod.NAME, version = ReferenceMod.VERSION, acceptedMinecraftVersions = ReferenceMod.MC_VERSIONS)
public class MoreOreMod {

	@Instance
	public static MoreOreMod instance;
	
	@SidedProxy(clientSide = ReferenceProxy.CLIENT_PROXY_CLASS, serverSide = ReferenceProxy.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		ModTabs.init();
		
		ModItems.init();
		ModItems.register();
		
		ModTools.initMaterials();
		ModTools.init();
		ModTools.register();
		
		ModBlocks.init();
		ModBlocks.register();
		
		ModGenerators.init();
		ModGenerators.register();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		proxy.init(event);
		
		ModCrafting.register();
		ModSmelting.register();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	@EventHandler
	public void serverStarting(FMLServerStartingEvent event) {
		
	}
	
}
