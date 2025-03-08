package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SNOW_CANNON extends SItem implements SkullItem, Sellable, Museum {

    @Override
    public String getName() {
        return "Frosty the Snow Cannon";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SNOW_CANNON"; 
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
    public boolean isMuseum() {
        return true;
    }

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwODc0NzMzMDIwNCwKICAicHJvZmlsZUlkIiA6ICIyMDZlMWZkYjI5Yzk0NGYxOTQ5OTg4NzAwNTQxMGQ2NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJoNHlsMzMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzY4ZTBmNDFkODFhZjA3NmRiMDViMzhlZmJmMTMyNWI0M2ZkZmI3ODI4ZDczMjY3M2Q2Y2YzNWU5NjhkOWRjYyIKICAgIH0KICB9Cn0=";
    }

}
