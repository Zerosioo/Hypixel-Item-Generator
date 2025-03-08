package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CLAY_BRACELET extends SItem implements ItemStatistics,SkullItem {

    @Override
    public String getName() {
        return "Clay Bracelet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CLAY_BRACELET"; 
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
    public int getStrength() {
        return 3;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwMzE5NDgwMzAxOCwKICAicHJvZmlsZUlkIiA6ICI1NzgzZWMxNDgxMDI0ZDJmOTk4N2JhNGZhNWNlMmFmOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJCbHVlUGhlbml4NDMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQ4ZTRhNGMyZjc3ZDMzYTQ0MDJmNWUxNzc3ZjkyZTRiM2Y3NzYxZWUxYjE5YjNhOTlhMzBiMDAyYTY1N2FhMSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
