package com.gl18.items;

import com.gl18.groups.GroupGL18;
import com.gl18.groups.GroupInitializer;
import net.minecraft.item.Item;

public class BadgeItem extends Item {
    public BadgeItem() {
        super(new Item.Properties().group(GroupInitializer.GroupGL18));
    }
}
