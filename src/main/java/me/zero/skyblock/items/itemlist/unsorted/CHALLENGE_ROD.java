package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CHALLENGE_ROD extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Challenging Rod";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CHALLENGE_ROD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.FISHING_ROD;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

    @Override
    public int getPrice() {
        return 5000;
    }

    @Override
    public int getStrength() {
        return 60;
    }

    @Override
    public int getFishingSpeed() {
        return 75;
    }

}
