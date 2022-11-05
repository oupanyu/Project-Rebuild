package com.gl18.groups;

import com.gl18.registries.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class GroupGL18 extends ItemGroup {
    public GroupGL18() {
        super("gl18");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.SCHOOL_BADGE.get());
    }
}
