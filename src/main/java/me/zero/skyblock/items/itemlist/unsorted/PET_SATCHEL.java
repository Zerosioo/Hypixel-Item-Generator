package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PET_SATCHEL extends SItem  {

    @Override
    public String getName() {
        return "Pet Satchel";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PET_SATCHEL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.FLOWER_POT_ITEM;
    }

}
