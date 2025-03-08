package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LEAPING_SWORD extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Leaping Sword";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LEAPING_SWORD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_SWORD;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

    @Override
    public int getPrice() {
        return 375000;
    }

    @Override
    public int getDamage() {
        return 150;
    }

    @Override
    public int getCritDamage() {
        return 25;
    }

}
