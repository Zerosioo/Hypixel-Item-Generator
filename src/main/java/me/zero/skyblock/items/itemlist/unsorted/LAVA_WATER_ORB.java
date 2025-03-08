package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LAVA_WATER_ORB extends SItem implements SkullItem, Sellable {

    @Override
    public String getName() {
        return "Lava Water Orb";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Extremely hot to the","touch.","","§8Shouldn't this be","§8steam..?")); 
    }

    @Override
    public String getId() {
        return "LAVA_WATER_ORB"; 
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
        return 5000;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MjUwMzIzMiwKICAicHJvZmlsZUlkIiA6ICIzODhhMzgxMmRhZTQ0NDFkYWI4MjJjODZmNWY0YjNmYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJFbE1henppdGEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWRmOTZjY2Q5Mjk5MGRkOGI4NTUzZDJjY2VhYjRjMmM5YjIwOGFhMjI1ZGIxNTc1ODJmY2Q1NjY5MTVkNGJjZiIKICAgIH0KICB9Cn0=";
    }

}
