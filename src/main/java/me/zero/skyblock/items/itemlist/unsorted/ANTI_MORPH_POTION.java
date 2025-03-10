package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ANTI_MORPH_POTION extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "Anti-Morph Potion";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ANTI_MORPH_POTION"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxNjExMTQ5Mzc3NiwKICAicHJvZmlsZUlkIiA6ICJmZWY5ZDJmY2NkODE0MzJhYjA3NWRhMzBkNWZlMjdmMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJKb2VuVE5UIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2VhZGQzMDllY2VmZGIxZGYxOGVlZjZmOGQ0MDgzYjQ3YjNlZTIyNzI4NmMwZjM3NWY0NTM2OWQ4M2ZiMzBiZCIKICAgIH0KICB9Cn0=";
    }

}
