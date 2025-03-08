package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REMOTE_TIME_CHAMBER_REMOTE extends SItem  {

    @Override
    public String getName() {
        return "Remote Time Chamber Remote";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "REMOTE_TIME_CHAMBER_REMOTE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.PAINTING;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

}
