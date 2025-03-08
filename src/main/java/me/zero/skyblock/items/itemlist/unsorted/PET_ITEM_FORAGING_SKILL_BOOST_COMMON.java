package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PET_ITEM_FORAGING_SKILL_BOOST_COMMON extends SItem  {

    @Override
    public String getName() {
        return "Foraging Exp Boost";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PET_ITEM_FORAGING_SKILL_BOOST_COMMON"; 
    }

    @Override
    public Material getMaterial() {
        return Material.IRON_AXE;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

}
