package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PUMPKIN_DICER_2 extends SItem  {

    @Override
    public String getName() {
        return "Pumpkin Dicer 2.0";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§oSomeone once said,","§o2 is always better","§othan 1!")); 
    }

    @Override
    public String getId() {
        return "PUMPKIN_DICER_2"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_AXE;
    }

    @Override
    public Tier getTier() {
        return Tier.EPIC;
    }

}
