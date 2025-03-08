package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LIVID_DAGGER extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Livid Dagger";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LIVID_DAGGER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_SWORD;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

    @Override
    public int getGearScore() {
        return 75;
    }

    @Override
    public int getPrice() {
        return 500000;
    }

    @Override
    public int getDamage() {
        return 210;
    }

    @Override
    public int getCritChance() {
        return 100;
    }

    @Override
    public int getCritDamage() {
        return 50;
    }

    @Override
    public int getAttackSpeed() {
        return 50;
    }

}
