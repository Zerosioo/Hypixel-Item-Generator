package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REFINED_BOTTLE_OF_JYRRE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Refined Bottle of Jyrre";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REFINED_BOTTLE_OF_JYRRE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.POTION;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public int getPrice() {
        return 30000;
    }

}
