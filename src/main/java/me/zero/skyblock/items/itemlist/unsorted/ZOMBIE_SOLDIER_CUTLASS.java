package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZOMBIE_SOLDIER_CUTLASS extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Zombie Soldier Cutlass";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ZOMBIE_SOLDIER_CUTLASS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_SWORD;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

    @Override
    public int getGearScore() {
        return 5;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public int getDamage() {
        return 0;
    }

    @Override
    public int getAttackSpeed() {
        return 0;
    }

}
