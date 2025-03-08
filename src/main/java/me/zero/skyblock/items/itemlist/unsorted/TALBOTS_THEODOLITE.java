package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TALBOTS_THEODOLITE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Talbot's Theodolite";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TALBOTS_THEODOLITE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIODE;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

    @Override
    public boolean isUnStackable() {
        return true;
    }

    @Override
    public int getPrice() {
        return 10;
    }

}
