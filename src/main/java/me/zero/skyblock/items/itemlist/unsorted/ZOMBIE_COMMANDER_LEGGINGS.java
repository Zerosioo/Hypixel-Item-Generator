package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZOMBIE_COMMANDER_LEGGINGS extends SItem implements ColoredArmor, Sellable {

    @Override
    public String getName() {
        return "Zombie Commander Leggings";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ZOMBIE_COMMANDER_LEGGINGS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_LEGGINGS;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(213,18,48);
    }

    @Override
    public int getGearScore() {
        return 40;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public int getHealth() {
        return 0;
    }

    @Override
    public int getDefense() {
        return 0;
    }

    @Override
    public int getIntelligence() {
        return 0;
    }

}
