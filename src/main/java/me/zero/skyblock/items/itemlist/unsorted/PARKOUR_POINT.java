package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PARKOUR_POINT extends SItem  {

    @Override
    public String getName() {
        return "Parkour Checkpoint";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PARKOUR_POINT"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_PLATE;
    }

}
