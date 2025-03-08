package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RECORD_7 extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Music Disc - Mellohi";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "RECORD_7"; 
    }

    @Override
    public Material getMaterial() {
        return Material.RECORD_7;
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
