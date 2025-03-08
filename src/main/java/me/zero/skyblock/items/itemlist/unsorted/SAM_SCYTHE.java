package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SAM_SCYTHE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Sam's Scythe";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SAM_SCYTHE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.WOOD_HOE;
    }

    @Override
    public Tier getTier() {
        return Tier.COMMON;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
