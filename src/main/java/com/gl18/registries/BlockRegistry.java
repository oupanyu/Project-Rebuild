package com.gl18.registries;

import com.gl18.blocks.BlockClock;
import com.gl18.blocks.BlockTest;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.gl18.Utils.MODID;

public class BlockRegistry {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("test", () -> new BlockTest(AbstractBlock.Properties.create(Material.WOOD)));

    public static final RegistryObject<Block> CLOCK_BLOCK = BLOCKS.register("clock", () -> new BlockClock(AbstractBlock.Properties.create(Material.IRON)));

    public static void registry(){
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
