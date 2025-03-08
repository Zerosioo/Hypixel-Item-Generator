package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTED_RAW_CHICKEN extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Enchanted Raw Chicken";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENCHANTED_RAW_CHICKEN"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RAW_CHICKEN;
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
        return 640;
    }

}
