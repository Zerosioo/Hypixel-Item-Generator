package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CHEWED_GUM extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "Chewed Piece of Gum";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CHEWED_GUM"; 
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
        return Tier.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwODIzMTU0NTAzOSwKICAicHJvZmlsZUlkIiA6ICJmYzFhOTdlNTgxM2Y0NDI2YTNmZTI4ZjJiNDc1ZjA4ZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJnZXRPbmxpbmVQbGF5ZXJzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzJjZGQwMjYxMzQ4ZTk1YzNkMDVhYWI4YTEwMTM0YzRiMDM5OTlkMWZhMzZiOWZjMDgwMTU4NDk1MDg2MGRjMSIKICAgIH0KICB9Cn0=";
    }

}
