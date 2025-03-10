package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ANNI_PODIUM_ART_RUNNERUP extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "10th Anniversary Podium";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ANNI_PODIUM_ART_RUNNERUP"; 
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
    public boolean isUnStackable() {
        return true;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY4MTUwMTgxODUwNSwKICAicHJvZmlsZUlkIiA6ICI0ODI1MmJmMjE0Yzk0Y2JjODZiMWRkNjgxNDA5NmYxNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJNZWNoYW5pY2FsX2hpdmUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGEwOWUyMDgzMjU5ZGM2NzM1OWQwNzQxNDY4MTg1YjQ3MTY5NDA3OGQ4NjZmNmYyYWFhNTE5Njc3MzBlYmZiNiIKICAgIH0KICB9Cn0=";
    }

}
