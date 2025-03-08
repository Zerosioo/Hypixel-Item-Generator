package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WINTER_HOMESTEAD_BARN_SKIN extends SItem  {

    @Override
    public String getName() {
        return "Winter Homestead Barn Skin";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "WINTER_HOMESTEAD_BARN_SKIN"; 
    }

    @Override
    public Material getMaterial() {
        return Material.PACKED_ICE;
    }

    @Override
    public byte getDurability() {
        return 2;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

}
