package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class POISONOUS_POTATO extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Poisonous Potato";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "POISONOUS_POTATO"; 
    }

    @Override
    public Material getMaterial() {
        return Material.POISONOUS_POTATO;
    }

    @Override
    public int getPrice() {
        return 10;
    }

}
