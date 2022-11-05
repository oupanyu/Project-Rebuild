package com.gl18.registries;

import com.gl18.Gl18Rb;
import com.gl18.Utils;
import com.gl18.items.BadgeItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.gl18.Utils.MODID;

public class SoundEventRegistry {

    public static final DeferredRegister<SoundEvent> SOUND_EVENT = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MODID);

    public static final RegistryObject<SoundEvent> MUSIC_TEST = register("music_test");

    public static final RegistryObject<SoundEvent> MUSIC_FANGHUA_SHIBA = register("music_fanghua_shiba");

    public static RegistryObject<SoundEvent> register(String key){
        return SOUND_EVENT.register(key, () ->new SoundEvent(new ResourceLocation(MODID,key)));
    }
}
