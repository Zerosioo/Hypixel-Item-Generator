package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MUSHROOM_SOUP extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Mushroom Soup";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MUSHROOM_SOUP"; 
    }

    @Override
    public Material getMaterial() {
        return Material.MUSHROOM_SOUP;
    }

    @Override
    public int getPrice() {
        return 5;
    }

}
