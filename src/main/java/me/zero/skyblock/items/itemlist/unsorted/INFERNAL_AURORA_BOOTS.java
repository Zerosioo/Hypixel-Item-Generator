package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class INFERNAL_AURORA_BOOTS extends SItem implements ItemStatistics,ColoredArmor {

    @Override
    public String getName() {
        return "Infernal Aurora Boots";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "INFERNAL_AURORA_BOOTS"; 
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
        return Color.fromRGB(97,132,252);
    }

    @Override
    public int getHealth() {
        return 328;
    }

    @Override
    public int getDefense() {
        return 101;
    }

    @Override
    public int getIntelligence() {
        return 315;
    }

}
