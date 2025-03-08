package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SMOOTH_BRICK_1 extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Mossy Stone Bricks";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SMOOTH_BRICK:1"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SMOOTH_BRICK;
    }

    @Override
    public byte getDurability() {
        return 1;
    }

    @Override
    public int getPrice() {
        return 2;
    }

}
