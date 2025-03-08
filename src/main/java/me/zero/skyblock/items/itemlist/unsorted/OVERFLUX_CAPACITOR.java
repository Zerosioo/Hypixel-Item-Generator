package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OVERFLUX_CAPACITOR extends SItem  {

    @Override
    public String getName() {
        return "Overflux Capacitor";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "OVERFLUX_CAPACITOR"; 
    }

    @Override
    public Material getMaterial() {
        return Material.QUARTZ;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

}
