package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ROTTEN_HELMET extends SItem implements ColoredArmor, Sellable {

    @Override
    public String getName() {
        return "Rotten Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ROTTEN_HELMET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_HELMET;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(158,112,3);
    }

    @Override
    public int getGearScore() {
        return 5;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public int getHealth() {
        return 0;
    }

}
