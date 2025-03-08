package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EMERALD_ORE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Emerald Ore";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "EMERALD_ORE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.EMERALD_ORE;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 8;
    }

}
