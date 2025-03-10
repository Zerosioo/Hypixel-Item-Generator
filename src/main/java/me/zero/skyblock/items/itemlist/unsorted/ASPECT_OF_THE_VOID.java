package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ASPECT_OF_THE_VOID extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Aspect of the Void";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ASPECT_OF_THE_VOID"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_SPADE;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

    @Override
    public int getPrice() {
        return 56000;
    }

    @Override
    public int getDamage() {
        return 120;
    }

}
