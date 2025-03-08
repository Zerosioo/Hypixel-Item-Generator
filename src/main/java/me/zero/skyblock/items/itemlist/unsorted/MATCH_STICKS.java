package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MATCH_STICKS extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Match-Sticks";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oThe head of","§7§oMatchos is a","§7§ocombination of","§7§oSulphur and a","§7§ocrystalline","§7§osubstance. With","§7§oeven the","§7§oslightest","§7§ofrictions they","§7§owill light up.")); 
    }

    @Override
    public String getId() {
        return "MATCH_STICKS"; 
    }

    @Override
    public Material getMaterial() {
        return Material.REDSTONE_TORCH_ON;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

    @Override
    public int getPrice() {
        return 10;
    }

}
