package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ALL_SKILLS_SUPER_BOOST extends SItem  {

    @Override
    public String getName() {
        return "All Skills Exp Super-Boost";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ALL_SKILLS_SUPER_BOOST"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DIAMOND;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

}
