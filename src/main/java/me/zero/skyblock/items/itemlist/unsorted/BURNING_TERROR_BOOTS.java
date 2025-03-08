package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BURNING_TERROR_BOOTS extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Burning Terror Boots";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BURNING_TERROR_BOOTS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_BOOTS;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(124,68,236);
    }

    @Override
    public int getCritDamage() {
        return 79;
    }

    @Override
    public int getHealth() {
        return 206;
    }

    @Override
    public int getDefense() {
        return 64;
    }

    @Override
    public int getIntelligence() {
        return 8;
    }

    @Override
    public int getSpeed() {
        return 19;
    }

}
