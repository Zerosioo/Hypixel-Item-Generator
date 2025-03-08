package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PIGMAN_SWORD extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Pigman Sword";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PIGMAN_SWORD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_SWORD;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public int getGearScore() {
        return 30;
    }

    @Override
    public int getPrice() {
        return 3100000;
    }

    @Override
    public int getDamage() {
        return 200;
    }

    @Override
    public int getCritChance() {
        return 5;
    }

    @Override
    public int getCritDamage() {
        return 30;
    }

    @Override
    public int getIntelligence() {
        return 300;
    }

}
