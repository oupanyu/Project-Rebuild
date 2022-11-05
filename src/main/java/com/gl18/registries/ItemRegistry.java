package com.gl18.registries;

import com.gl18.groups.GroupInitializer;
import com.gl18.items.BadgeItem;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.gl18.Utils.MODID;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<BlockItem> TEST_BLOCK_ITEM = ITEMS.register("test", () -> new BlockItem(BlockRegistry.TEST_BLOCK.get(),new Item.Properties().group(GroupInitializer.GroupGL18)));

    public static final RegistryObject<BlockItem> CLOCK_BLOCK_ITEM = ITEMS.register("clock", () -> new BlockItem(BlockRegistry.CLOCK_BLOCK.get(),new Item.Properties().group(GroupInitializer.GroupGL18)));

    public static final RegistryObject<Item> TEST_DISK = ITEMS.register("test_disk",() -> new MusicDiscItem(12,SoundEventRegistry.MUSIC_TEST,(new Item.Properties()).maxStackSize(1).group(GroupInitializer.GroupGL18).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> DISK_FHSB = ITEMS.register("disk_fhsb",() -> new MusicDiscItem(12,SoundEventRegistry.MUSIC_FANGHUA_SHIBA,(new Item.Properties()).maxStackSize(1).group(GroupInitializer.GroupGL18).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> SCHOOL_BADGE = ITEMS.register("badge_of_school", BadgeItem::new);
}
