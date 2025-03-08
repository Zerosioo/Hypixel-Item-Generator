package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HOPPER_MINECART extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Minecart with Hopper";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HOPPER_MINECART"; 
    }

    @Override
    public Material getMaterial() {
        return Material.HOPPER_MINECART;
    }

    @Override
    public int getPrice() {
        return 22;
    }

}
