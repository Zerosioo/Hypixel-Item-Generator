package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TELEPORT_PAD extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Teleport Pad";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "TELEPORT_PAD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ENDER_PORTAL_FRAME;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

}
