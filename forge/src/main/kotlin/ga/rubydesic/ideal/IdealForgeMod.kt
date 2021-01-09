package ga.rubydesic.ideal

import net.minecraft.block.Blocks
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext
import org.apache.logging.log4j.LogManager

@Mod("ideal_id")
class IdealForgeMod {
	private val LOGGER = LogManager.getLogger()

	init {
		// Register the setup method for modloading
		FMLJavaModLoadingContext.get().modEventBus.addListener(::setup)

		// Register ourselves for server and other game events we are interested in
		MinecraftForge.EVENT_BUS.register(this)
	}

	private fun setup(event: FMLCommonSetupEvent) {
		// some preinit code
		LOGGER.info("HELLO FROM PREINIT")
		LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.registryName)
	}
}