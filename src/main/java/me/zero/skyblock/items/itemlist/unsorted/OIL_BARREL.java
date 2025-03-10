package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OIL_BARREL extends SItem implements SkullItem, Sellable {

    @Override
    public String getName() {
        return "Oil Barrel";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§o100% unrenewable","§7§oenergy!")); 
    }

    @Override
    public String getId() {
        return "OIL_BARREL"; 
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
    public int getPrice() {
        return 1000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYyMDg0OTg4MDg2NSwKICAicHJvZmlsZUlkIiA6ICIyMzYxYmNlZjZkMWM0ZWI1OGNhMDUzNDFjNGU4MGM0YyIsCiAgInByb2ZpbGVOYW1lIiA6ICJIaXJvQ2FwdWNjaW5vODciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDVkMjc1MDU5NTQ3N2VjYzEzODY5NTgwYjEyZmZjM2IxM2ZjMmIzYWMzZTUwMzVlY2ZjOWFhZmEwMzY3MjJhMiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9";
    }

}
