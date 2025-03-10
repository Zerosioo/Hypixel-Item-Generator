package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GATEWAY_WAND extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "Gateway Wand";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GATEWAY_WAND"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzOTk0NzE1NDI2NiwKICAicHJvZmlsZUlkIiA6ICJlMmVkYTM1YjMzZGU0M2UxOTVhZmRkNDgxNzQ4ZDlhOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJDaGFsa19SaWNlR0kiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDM2NTc4MGU4OWVlMjdhNTM5NTBlMDJiY2U3YWY2Y2I1YTA0Y2RmNWQxZmQzYWMwMGNmNTZmNzE1NmZhYTMxYyIKICAgIH0KICB9Cn0=";
    }

}
