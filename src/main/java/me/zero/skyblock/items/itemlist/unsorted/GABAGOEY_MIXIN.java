package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GABAGOEY_MIXIN extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "Gabagoey Mixin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GABAGOEY_MIXIN"; 
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
    public boolean isUnStackable() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY3NjI5NTY2NzU0MiwKICAicHJvZmlsZUlkIiA6ICI0ODI1MmJmMjE0Yzk0Y2JjODZiMWRkNjgxNDA5NmYxNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJNZWNoYW5pY2FsX2hpdmUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDFlODEzYTNhMzgwZTNlYjIwMWMyNGI5NjYxZjZlZGIzOWJkZjQyYTg4OTg5ZjgxYTkwZjc3MTk5N2Q2ZjVjZCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
