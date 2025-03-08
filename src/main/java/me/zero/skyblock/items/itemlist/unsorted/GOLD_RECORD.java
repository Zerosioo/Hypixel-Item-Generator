package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GOLD_RECORD extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Music Disc - 13";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GOLD_RECORD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_RECORD;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 20;
    }

}
