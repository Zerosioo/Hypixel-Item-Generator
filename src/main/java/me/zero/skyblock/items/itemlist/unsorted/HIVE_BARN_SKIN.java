package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HIVE_BARN_SKIN extends SItem  {

    @Override
    public String getName() {
        return "Hive Barn Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HIVE_BARN_SKIN"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STAINED_CLAY;
    }

    @Override
    public byte getDurability() {
        return 4;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

}
