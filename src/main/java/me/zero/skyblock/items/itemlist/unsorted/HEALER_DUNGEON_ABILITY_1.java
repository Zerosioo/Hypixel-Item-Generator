package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HEALER_DUNGEON_ABILITY_1 extends SItem implements SkullItem, Sellable {

    @Override
    public String getName() {
        return "Healing Aura";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HEALER_DUNGEON_ABILITY_1"; 
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
        return 1;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTYzODE3OTA0ODY1MiwKICAicHJvZmlsZUlkIiA6ICI2MjM5ZWRhM2ExY2Y0YjJiYWMyODk2NGQ0NmNlOWVhOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJGYXRGYXRHb2QiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWUwZTJmYWI1ZGUyMjg4MTcxNGJmN2JkN2UwZDU2NDQxZDJmM2MxNThmZDgyYWEyNTM2MDI4YTQ1MDgzMDBmNiIKICAgIH0KICB9Cn0=";
    }

}
