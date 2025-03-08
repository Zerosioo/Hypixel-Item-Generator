package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SAPLING_3 extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Jungle Sapling";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SAPLING:3"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SAPLING;
    }

    @Override
    public byte getDurability() {
        return 3;
    }

    @Override
    public int getPrice() {
        return 0;
    }

}
