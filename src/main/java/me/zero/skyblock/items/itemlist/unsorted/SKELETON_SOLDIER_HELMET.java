package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SKELETON_SOLDIER_HELMET extends SItem implements ColoredArmor, Sellable {

    @Override
    public String getName() {
        return "Skeleton Soldier Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SKELETON_SOLDIER_HELMET"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_HELMET;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(255,188,11);
    }

    @Override
    public int getGearScore() {
        return 10;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public int getCritChance() {
        return 0;
    }

    @Override
    public int getCritDamage() {
        return 0;
    }

    @Override
    public int getHealth() {
        return 0;
    }

    @Override
    public int getDefense() {
        return 0;
    }

}
