package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IRON_TRAPDOOR extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Iron Trapdoor";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "IRON_TRAPDOOR"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_TRAPDOOR;
    }

    @Override
    public int getPrice() {
        return 8;
    }

}
