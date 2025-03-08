package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SCULPTORS_AXE extends SItem implements  Sellable, Museum {

    @Override
    public String getName() {
        return "Sculptor's Axe";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SCULPTORS_AXE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STONE_AXE;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public int getPrice() {
        return 64;
    }

}
