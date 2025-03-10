package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTED_RAW_SALMON extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Enchanted Raw Salmon";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENCHANTED_RAW_SALMON"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RAW_FISH;
    }

    @Override
    public byte getDurability() {
        return 1;
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
        return 1600;
    }

}
