package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MOOGMA_PELT extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Moogma Pelt";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oThe bottom of","§7§othe volcano is","§7§ofilled with it,","§7§oMoogmas keep on","§7§omoulting. It's a","§7§oproblem.")); 
    }

    @Override
    public String getId() {
        return "MOOGMA_PELT"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public int getPrice() {
        return 50;
    }

}
