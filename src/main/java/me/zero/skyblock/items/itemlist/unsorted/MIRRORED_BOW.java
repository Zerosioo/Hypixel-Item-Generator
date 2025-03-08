package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MIRRORED_BOW extends SItem  {

    @Override
    public String getName() {
        return "woB";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "MIRRORED_BOW"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BOW;
    }

}
