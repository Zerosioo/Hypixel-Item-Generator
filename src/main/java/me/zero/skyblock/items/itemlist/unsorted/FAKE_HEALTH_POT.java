package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FAKE_HEALTH_POT extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Red Cross Potion";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "FAKE_HEALTH_POT"; 
    }

    @Override
    public Material getMaterial() {
        return Material.POTION;
    }

    @Override
    public byte getDurability() {
        return 16453;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
