package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BURSTMAW_DAGGER extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Mawdredge Dagger";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BURSTMAW_DAGGER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_SWORD;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

    @Override
    public int getDamage() {
        return 130;
    }

    @Override
    public int getCritDamage() {
        return 20;
    }

    @Override
    public int getAttackSpeed() {
        return 10;
    }

}
