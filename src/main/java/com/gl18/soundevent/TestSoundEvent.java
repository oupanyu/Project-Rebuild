package com.gl18.soundevent;

import net.minecraft.client.audio.SoundEngine;
import net.minecraftforge.client.event.sound.SoundEvent;

public class TestSoundEvent extends SoundEvent {
    public TestSoundEvent(SoundEngine manager) {
        super(manager);
    }
}
