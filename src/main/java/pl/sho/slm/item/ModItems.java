package pl.sho.slm.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import pl.sho.slm.ShosLearningMod;

public class ModItems {

    public static final Item BALL_ING = registerItem("ball_ing", new Item(new Item.Settings()));
    public static final Item WHITE_BALL = registerItem("white_ball", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ShosLearningMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ShosLearningMod.LOGGER.info("Registering mod items for "+ ShosLearningMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(BALL_ING);
            entries.add(WHITE_BALL);
        });
    }

}
