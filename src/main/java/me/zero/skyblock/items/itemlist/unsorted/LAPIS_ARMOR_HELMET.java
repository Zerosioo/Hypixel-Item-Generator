package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LAPIS_ARMOR_HELMET extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Lapis Armor Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LAPIS_ARMOR_HELMET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SEA_LANTERN;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public int getDefense() {
        return 25;
    }

    @Override
    public int getMiningFortune() {
        return 2;
    }

    @Override
    public int getMiningSpeed() {
        return 20;
    }

}
