package redper.minecraft.moreoremod.proxy;

import redper.minecraft.moreoremod.init.*;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {

		ModItems.registerRenders();
		
		ModBlocks.registerRenders();
		
	}

}
