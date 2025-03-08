package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SKYBLOCK_MENU extends SItem  {

    @Override
    public String getName() {
        return "SkyBlock Menu";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SKYBLOCK_MENU"; 
    }

    @Override
    public Material getMaterial() {
        return Material.NETHER_STAR;
    }

}
