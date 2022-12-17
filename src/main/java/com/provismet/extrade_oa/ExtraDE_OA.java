package com.provismet.extrade_oa;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.provismet.extrade_oa.powers.PowerFactories;

public class ExtraDE_OA implements ModInitializer {
	public static final String modid = "ExtraDE_OA";
	public static final Logger LOGGER = LoggerFactory.getLogger(modid);

	public static Identifier powerID (String name) {
		return new Identifier("extrade", name);
	}

	@Override
	public void onInitialize() {
		PowerFactories.register();
	}
}
