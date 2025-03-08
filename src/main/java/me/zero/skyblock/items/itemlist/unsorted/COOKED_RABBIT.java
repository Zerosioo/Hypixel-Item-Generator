package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class COOKED_RABBIT extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Cooked Rabbit";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "COOKED_RABBIT"; 
    }

    @Override
    public Material getMaterial() {
        return Material.COOKED_RABBIT;
    }

    @Override
    public int getPrice() {
        return 4;
    }

}
