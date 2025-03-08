package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FOOTPRINT_FOSSIL extends SItem implements SkullItem, Sellable {

    @Override
    public String getName() {
        return "Footprint Fossil";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("The daunting","footprint of what","was once a colossal","and bloodthirsty","predator.")); 
    }

    @Override
    public String getId() {
        return "FOOTPRINT_FOSSIL"; 
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
        return Tier.LEGENDARY;
    }

    @Override
    public int getPrice() {
        return 50000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwODY0MzQ2NzgxMiwKICAicHJvZmlsZUlkIiA6ICI0NTM1Y2RjNjk3NGU0Nzk4YjljYzY4ODlkZWY1MDk2NiIsCiAgInByb2ZpbGVOYW1lIiA6ICIzZXlyZW4iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjJhZTM0YzQ5MjdjMDJiZmNjMDUzNDIwZWZmMTY4OTAxNmYxMTg5MGNlNTVmYTZkZDhhZjMzYzJhNzEyZGM4NCIKICAgIH0KICB9Cn0=";
    }

}
