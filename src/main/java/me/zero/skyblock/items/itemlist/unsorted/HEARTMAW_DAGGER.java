package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HEARTMAW_DAGGER extends SItem implements ItemStatistics {

    @Override
    public String getName() {
        return "Deathripper Dagger";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HEARTMAW_DAGGER"; 
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
    public int getDamage() {
        return 160;
    }

    @Override
    public int getCritChance() {
        return 10;
    }

    @Override
    public int getCritDamage() {
        return 25;
    }

    @Override
    public int getAttackSpeed() {
        return 20;
    }

}
