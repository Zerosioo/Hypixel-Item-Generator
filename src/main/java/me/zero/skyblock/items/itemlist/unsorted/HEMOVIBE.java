package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HEMOVIBE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Hemovibe";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Dropped by vampires","from the multiverse","coven.")); 
    }

    @Override
    public String getId() {
        return "HEMOVIBE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.REDSTONE_ORE;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 100;
    }

}
