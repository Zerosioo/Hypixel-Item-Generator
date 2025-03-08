package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CASTLE_BARN_SKIN extends SItem  {

    @Override
    public String getName() {
        return "Castle Barn Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CASTLE_BARN_SKIN"; 
    }

    @Override
    public Material getMaterial() {
        return Material.COBBLESTONE;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

}
