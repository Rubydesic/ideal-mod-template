package ga.rubydesic.ideal.mixin;


import net.minecraft.client.gui.screen.TitleScreen;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ExampleMixin {
	// THIS SHADOW FIELD (a YARN name) does NOT work
//	@Shadow @Final
//	private static Logger field_23775;


	@Inject(at = @At("HEAD"), method = "init")
	private void init(CallbackInfo info) {
		System.out.println("This line is printed by an example mod mixin!");
	}
}