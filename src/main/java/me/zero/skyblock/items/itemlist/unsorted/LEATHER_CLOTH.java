package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LEATHER_CLOTH extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Leather Cloth";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oThe origin of","§7§othat leather is","§7§oa well kept","§7§osecret.")); 
    }

    @Override
    public String getId() {
        return "LEATHER_CLOTH"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public int getPrice() {
        return 500;
    }

}
