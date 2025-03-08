package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RECORD_11 extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Music Disc - 11";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RECORD_11"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RECORD_11;
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
