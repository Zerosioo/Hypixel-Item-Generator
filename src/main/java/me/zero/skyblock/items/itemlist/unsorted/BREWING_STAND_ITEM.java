package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BREWING_STAND_ITEM extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Brewing Stand";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "BREWING_STAND_ITEM"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BREWING_STAND_ITEM;
    }

    @Override
    public int getPrice() {
        return 12;
    }

}
