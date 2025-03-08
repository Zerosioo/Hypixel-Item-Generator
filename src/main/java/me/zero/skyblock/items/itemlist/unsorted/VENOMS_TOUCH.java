package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VENOMS_TOUCH extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Venom's Touch";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "VENOMS_TOUCH"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BOW;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

    @Override
    public int getPrice() {
        return 5000;
    }

    @Override
    public int getDamage() {
        return 250;
    }

}
