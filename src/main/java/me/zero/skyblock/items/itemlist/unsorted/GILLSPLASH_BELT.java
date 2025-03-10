package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GILLSPLASH_BELT extends SItem implements ItemStatistics,SkullItem, Sellable {

    @Override
    public String getName() {
        return "Gillsplash Belt";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GILLSPLASH_BELT"; 
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
        return 9000;
    }

    @Override
    public int getHealthRegeneration() {
        return 2;
    }

    @Override
    public int getFishingSpeed() {
        return 14;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MjQ4Nzc5NTIwNSwKICAicHJvZmlsZUlkIiA6ICI4M2EwYjZmOGVjMWI0YTU3OGQ2NmJlZDE2MmQ4M2I4MyIsCiAgInByb2ZpbGVOYW1lIiA6ICJTbmlwZWRfQnlfS2NhbHMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTJkYzViZTUxZWZiODI3ZmZjNjk4NGZiYjcyNDNiNzBjNTRlNDBiMTNjNGJhYzRjM2ZlNmQ4YWQzMmZhNWViOSIKICAgIH0KICB9Cn0=";
    }

}
