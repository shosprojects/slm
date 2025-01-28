package pl.sho.slm.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import pl.sho.slm.ShosLearningMod;

public class ModBlocks {


    public static final Block BALLING_BLOCK = registerBlock("balling_block",
            new Block(AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.TRIAL_SPAWNER)));

    public static final Block SAD_BLOCK = registerBlock("sad_block",
            new Block(AbstractBlock.Settings.create().strength(10f,0f).sounds(BlockSoundGroup.ANVIL).jumpVelocityMultiplier(.9f)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ShosLearningMod.MOD_ID, name),
                block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ShosLearningMod.MOD_ID, name),
            new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        ShosLearningMod.LOGGER.info("Registering mod blocks for "+ ShosLearningMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
            entries.add(ModBlocks.BALLING_BLOCK);
            entries.add(ModBlocks.SAD_BLOCK);
        });
    }

}
