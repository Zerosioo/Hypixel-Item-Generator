package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MELON extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Melon";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MELON"; 
    }

    @Override
    public Material getMaterial() {
        return Material.MELON;
    }

    @Override
    public int getPrice() {
        return 2;
    }

}
