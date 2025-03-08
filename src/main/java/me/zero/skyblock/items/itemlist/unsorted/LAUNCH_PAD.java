package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LAUNCH_PAD extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Launch Pad";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LAUNCH_PAD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SLIME_BLOCK;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

    @Override
    public int getPrice() {
        return 3200;
    }

}
