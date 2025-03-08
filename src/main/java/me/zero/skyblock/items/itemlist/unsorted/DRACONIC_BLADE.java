package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DRACONIC_BLADE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Draconic Blade";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§8§oAn extremely","§8§osharp blade","§8§oformed by dragon","§8§onuclei")); 
    }

    @Override
    public String getId() {
        return "DRACONIC_BLADE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.BLAZE_ROD;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

    @Override
    public int getPrice() {
        return 100000;
    }

}
