package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PRISMARINE_CRYSTALS extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Prismarine Crystals";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PRISMARINE_CRYSTALS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.PRISMARINE_CRYSTALS;
    }

    @Override
    public int getPrice() {
        return 5;
    }

}
