package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HUB_WIZARD_TOWER_TRAVEL_SCROLL extends SItem  {

    @Override
    public String getName() {
        return "Travel Scroll to the Wizard Tower";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HUB_WIZARD_TOWER_TRAVEL_SCROLL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.EMPTY_MAP;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

}
