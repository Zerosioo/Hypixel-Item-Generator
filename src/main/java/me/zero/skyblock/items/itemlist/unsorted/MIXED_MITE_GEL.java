package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MIXED_MITE_GEL extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Mixed Mite Gel";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oPowerful","§8§osubstance","§8§ocombined from","§8§othe plasma","§8§omembrane of many","§8§oEndermites.")); 
    }

    @Override
    public String getId() {
        return "MIXED_MITE_GEL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.INK_SACK;
    }

    @Override
    public byte getDurability() {
        return 14;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public int getPrice() {
        return 15000;
    }

}
