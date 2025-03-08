package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FELTHORN_REAPER extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Felthorn Reaper";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FELTHORN_REAPER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_SWORD;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public int getDamage() {
        return 275;
    }

    @Override
    public int getCritDamage() {
        return 115;
    }

    @Override
    public int getSwingRange() {
        return 1;
    }

}
