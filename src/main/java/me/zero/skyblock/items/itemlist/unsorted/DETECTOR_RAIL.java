package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DETECTOR_RAIL extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Detector Rail";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DETECTOR_RAIL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DETECTOR_RAIL;
    }

    @Override
    public int getPrice() {
        return 2;
    }

}
