package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SQUASH extends SItem implements SkullItem, Sellable {

    @Override
    public String getName() {
        return "Squash";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SQUASH"; 
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
    public int getPrice() {
        return 75000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY2MjUwMjk0ODA3NCwKICAicHJvZmlsZUlkIiA6ICI2ODAwNzFmZTIxOWE0OWNmYmM3MDIxMjc1NTI0NDIwMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZXphYm95ODAiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzZhZTA3NjY0OWVmMjJmNjBlODUxMTgzMWM2OGZkMmI2ZWE2M2MzMjE2NGRhYjMzYThhZWJjMThmZjJhNTRjOCIKICAgIH0KICB9Cn0=";
    }

}
