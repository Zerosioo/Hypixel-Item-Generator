package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MOSQUITO_BOW extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Mosquito Bow";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MOSQUITO_BOW"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BOW;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

    @Override
    public int getDamage() {
        return 251;
    }

    @Override
    public int getCritDamage() {
        return 39;
    }

    @Override
    public int getVitality() {
        return 20;
    }

}
