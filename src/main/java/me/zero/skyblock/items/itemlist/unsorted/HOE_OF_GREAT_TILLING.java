package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HOE_OF_GREAT_TILLING extends SItem  {

    @Override
    public String getName() {
        return "Hoe of Great Tilling";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HOE_OF_GREAT_TILLING"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STONE_HOE;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

}
