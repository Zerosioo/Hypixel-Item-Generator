package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTED_QUARTZ_BLOCK extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Enchanted Quartz Block";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENCHANTED_QUARTZ_BLOCK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.QUARTZ_BLOCK;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public int getPrice() {
        return 102400;
    }

}
