package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARTIFACT_POTION_AFFINITY extends SItem implements SkullItem, Sellable {

    @Override
    public String getName() {
        return "Potion Affinity Artifact";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ARTIFACT_POTION_AFFINITY"; 
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
    public int getPrice() {
        return 64000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYwMjAzODM0MTI1OCwKICAicHJvZmlsZUlkIiA6ICI3NzI3ZDM1NjY5Zjk0MTUxODAyM2Q2MmM2ODE3NTkxOCIsCiAgInByb2ZpbGVOYW1lIiA6ICJsaWJyYXJ5ZnJlYWsiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTZmOTExOWExZDFmYjAxYmI5N2RiODlhZWJhNTZmZjVlZTExMjA3OWU0MzJhMmI1MGZhM2E4MGE4OTU0ZGIzOCIKICAgIH0KICB9Cn0=";
    }

}
