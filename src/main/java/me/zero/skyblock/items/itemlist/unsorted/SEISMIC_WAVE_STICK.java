package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SEISMIC_WAVE_STICK extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Seismic Wave";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SEISMIC_WAVE_STICK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STICK;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public int getDamage() {
        return 10;
    }

}
