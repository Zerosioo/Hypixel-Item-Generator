package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class THIN_GLASS extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Glass Pane";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "THIN_GLASS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.THIN_GLASS;
    }

    @Override
    public int getPrice() {
        return 0;
    }

}
