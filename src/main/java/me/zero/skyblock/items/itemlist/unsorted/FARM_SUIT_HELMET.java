package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FARM_SUIT_HELMET extends SItem implements ItemStatistics,ColoredArmor, Sellable {

    @Override
    public String getName() {
        return "Farm Suit Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FARM_SUIT_HELMET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_HELMET;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(255,255,0);
    }

    @Override
    public int getPrice() {
        return 25;
    }

    @Override
    public int getDefense() {
        return 15;
    }

    @Override
    public int getFarmingFortune() {
        return 5;
    }

}
