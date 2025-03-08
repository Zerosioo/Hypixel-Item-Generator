package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DUNGEON_TRAP extends SItem  {

    @Override
    public String getName() {
        return "Trap";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DUNGEON_TRAP"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_PLATE;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

}
