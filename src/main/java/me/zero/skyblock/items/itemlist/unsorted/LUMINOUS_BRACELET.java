package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LUMINOUS_BRACELET extends SItem implements ItemStatistics,SkullItem {

    @Override
    public String getName() {
        return "Luminous Bracelet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LUMINOUS_BRACELET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SKULL_ITEM;
    }

    @Override
    public byte getDurability() {
        return 3;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

    @Override
    public int getFishingSpeed() {
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MTgwMTIzMDIwMiwKICAicHJvZmlsZUlkIiA6ICIxOTQzY2VmYzM4NWM0YTJjYWJiZGViODBjZTIwM2RjZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJzb29vb29vb29vb29vb29wIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzFlOTdmOTllOWVkYjg5ZWQ3YjEzMDkwYjkxODM5N2RhYzQ3ZmE3YTZlYTEwODBlNDM5Y2QzMzgwYTE2MDMxYzgiCiAgICB9CiAgfQp9";
    }

}
