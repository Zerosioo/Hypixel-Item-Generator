package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BIOFUEL extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Biofuel";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§o100% renewable","§7§oenergy!")); 
    }

    @Override
    public String getId() {
        return "BIOFUEL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.INK_SACK;
    }

    @Override
    public byte getDurability() {
        return 2;
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
        return 10000;
    }

}
