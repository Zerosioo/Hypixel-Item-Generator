package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PUMPKIN_DICER_3 extends SItem  {

    @Override
    public String getName() {
        return "Pumpkin Dicer 3.0";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§o"3.0 is better","§othan the 2.0","§oversion" - CEO of","§oPumpkinDicer LLC.")); 
    }

    @Override
    public String getId() {
        return "PUMPKIN_DICER_3"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_AXE;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

}
