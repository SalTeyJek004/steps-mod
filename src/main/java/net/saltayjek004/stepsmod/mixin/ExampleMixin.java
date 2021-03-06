package net.saltayjek004.stepsmod.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import net.saltayjek004.stepsmod.StepsMod;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		StepsMod.LOGGER.info("loading steps mod mixin");
	}
}
