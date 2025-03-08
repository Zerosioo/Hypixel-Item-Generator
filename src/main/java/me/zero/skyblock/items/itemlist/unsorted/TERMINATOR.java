package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TERMINATOR extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Terminator";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TERMINATOR"; 
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
    public boolean isGlowing() {
        return true;
    }

    @Override
    public int getDamage() {
        return 310;
    }

    @Override
    public int getCritDamage() {
        return 250;
    }

    @Override
    public int getAttackSpeed() {
        return 40;
    }

}
