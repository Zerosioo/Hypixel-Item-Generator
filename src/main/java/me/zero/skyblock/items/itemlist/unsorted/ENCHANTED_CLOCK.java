package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTED_CLOCK extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Enchanted Clock";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENCHANTED_CLOCK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.WATCH;
    }

    @Override
    public Tier getTier() {
        return Tier.UNOBTAINABLE;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public int getPrice() {
        return 205000;
    }

}
