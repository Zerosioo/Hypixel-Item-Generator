package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BLUE_GREATER_BACKPACK extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "Greater Backpack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BLUE_GREATER_BACKPACK"; 
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
        return Tier.EPIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMzk1OTU0MTg3MCwKICAicHJvZmlsZUlkIiA6ICJhYzczNzMyYmEzZTY0M2IxODE2ZDA2MDQ0M2U3ODhkOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUZXhXYXJkIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2MzZmUxZTczZWIzZjI4N2Y2NzQ4YmU4YTQ0MWM4NTM0NThmN2ZlYjNhNDljMWE2YzY4NjFjMmUyYWZjZTY1MSIKICAgIH0KICB9Cn0=";
    }

}
