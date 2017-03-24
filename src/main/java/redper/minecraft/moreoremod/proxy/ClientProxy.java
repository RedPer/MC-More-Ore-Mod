package redper.minecraft.moreoremod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import redper.minecraft.moreoremod.init.*;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@Override
	public void init(FMLInitializationEvent event) {

		ModItems.registerRenders();
		ModTools.registerRenders();
		ModBlocks.registerRenders();
		
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	@Override
	public void serverStarting(FMLServerStartingEvent event) {
		
	}
	
}
