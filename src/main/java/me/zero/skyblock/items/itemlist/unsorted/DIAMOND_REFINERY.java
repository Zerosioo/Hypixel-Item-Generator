package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DIAMOND_REFINERY extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Diamond Refinery";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DIAMOND_REFINERY"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND_ORE;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

    @Override
    public int getPrice() {
        return 1300;
    }

}
