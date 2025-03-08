package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIERY_CRIMSON_BOOTS extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Fiery Crimson Boots";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FIERY_CRIMSON_BOOTS"; 
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
        return Color.fromRGB(230,83,0);
    }

    @Override
    public int getCritDamage() {
        return 40;
    }

    @Override
    public int getHealth() {
        return 260;
    }

    @Override
    public int getDefense() {
        return 80;
    }

    @Override
    public int getIntelligence() {
        return 10;
    }

}
