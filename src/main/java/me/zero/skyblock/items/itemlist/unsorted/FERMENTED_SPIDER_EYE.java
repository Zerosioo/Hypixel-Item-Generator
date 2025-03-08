package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FERMENTED_SPIDER_EYE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Fermented Spider Eye";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FERMENTED_SPIDER_EYE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.FERMENTED_SPIDER_EYE;
    }

    @Override
    public int getPrice() {
        return 10;
    }

}
