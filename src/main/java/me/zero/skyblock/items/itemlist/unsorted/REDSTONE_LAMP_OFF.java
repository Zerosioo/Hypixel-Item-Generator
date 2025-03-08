package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REDSTONE_LAMP_OFF extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Redstone Lamp";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REDSTONE_LAMP_OFF"; 
    }

    @Override
    public Material getMaterial() {
        return Material.REDSTONE_LAMP_OFF;
    }

    @Override
    public int getPrice() {
        return 6;
    }

}
