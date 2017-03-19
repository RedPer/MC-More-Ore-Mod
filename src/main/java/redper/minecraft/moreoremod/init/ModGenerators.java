package redper.minecraft.moreoremod.init;

import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;
import redper.minecraft.moreoremod.generators.*;

public class ModGenerators {

	public static IWorldGenerator oreGenerator;
	
	public static void init() {
		
		oreGenerator = new OreGenerator();
		
	}
	
	public static void register() {
		
		GameRegistry.registerWorldGenerator(oreGenerator, 0);
		
	}
	
}
