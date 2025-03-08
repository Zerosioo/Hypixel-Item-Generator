package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class STAINED_GLASS_15 extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Black Stained Glass";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "STAINED_GLASS:15"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STAINED_GLASS;
    }

    @Override
    public byte getDurability() {
        return 15;
    }

    @Override
    public int getPrice() {
        return 3;
    }

}
