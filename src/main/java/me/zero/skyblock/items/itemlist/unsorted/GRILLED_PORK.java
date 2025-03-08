package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GRILLED_PORK extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Cooked Porkchop";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "GRILLED_PORK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GRILLED_PORK;
    }

    @Override
    public int getPrice() {
        return 5;
    }

}
