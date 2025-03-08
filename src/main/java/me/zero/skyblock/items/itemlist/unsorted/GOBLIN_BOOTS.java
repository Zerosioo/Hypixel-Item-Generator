package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GOBLIN_BOOTS extends SItem implements ItemStatistics,ColoredArmor, Sellable {

    @Override
    public String getName() {
        return "Goblin Boots";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GOBLIN_BOOTS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.LEATHER_BOOTS;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

    @Override
    public Color getColor() {
        return Color.fromRGB(55,176,66);
    }

    @Override
    public int getPrice() {
        return 1500;
    }

    @Override
    public int getHealth() {
        return 60;
    }

    @Override
    public int getIntelligence() {
        return -1;
    }

    @Override
    public int getMiningFortune() {
        return 4;
    }

    @Override
    public int getMiningSpeed() {
        return 10;
    }

}
