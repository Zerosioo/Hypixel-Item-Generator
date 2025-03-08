package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BONE_REAVER extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Bone Reaver";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BONE_REAVER"; 
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
    public int getPrice() {
        return 0;
    }

    @Override
    public int getDamage() {
        return 235;
    }

    @Override
    public int getSwingRange() {
        return 0;
    }

}
