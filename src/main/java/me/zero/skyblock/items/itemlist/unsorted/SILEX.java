package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SILEX extends SItem  {

    @Override
    public String getName() {
        return "Sharp Rock";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7A sharp rock with","§7sturdy","§7construction.")); 
    }

    @Override
    public String getId() {
        return "SILEX"; 
    }

    @Override
    public Material getMaterial() {
        return Material.QUARTZ;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

}
