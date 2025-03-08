package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SILENT_PEARL extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Silent Pearl";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SILENT_PEARL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ENDER_PEARL;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 100;
    }

}
