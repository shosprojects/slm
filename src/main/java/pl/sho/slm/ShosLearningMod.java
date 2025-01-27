package pl.sho.slm;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.sho.slm.item.ModItems;

//comment
public class ShosLearningMod implements ModInitializer {
	public static final String MOD_ID = "shoslearningmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}