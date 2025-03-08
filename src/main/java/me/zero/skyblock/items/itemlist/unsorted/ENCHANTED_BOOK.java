package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ENCHANTED_BOOK extends SItem  {

    @Override
    public String getName() {
        return "Enchanted Book";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ENCHANTED_BOOK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ENCHANTED_BOOK;
    }

}
