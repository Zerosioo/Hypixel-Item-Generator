package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ELLE_SUPPLIES extends SItem  {

    @Override
    public String getName() {
        return "%%green%%Elle's Supplies";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ELLE_SUPPLIES"; 
    }

    @Override
    public Material getMaterial() {
        return Material.CHEST;
    }

}
