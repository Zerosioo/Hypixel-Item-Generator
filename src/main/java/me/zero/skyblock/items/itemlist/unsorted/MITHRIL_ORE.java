package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MITHRIL_ORE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Mithril";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§o"The Man called","§7§oit "true-silver"","§7§owhile the","§7§oDwarves, who","§7§oloved it above","§7§oall things, had","§7§otheir own,","§7§osecret name for","§7§oit."")); 
    }

    @Override
    public String getId() {
        return "MITHRIL_ORE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.PRISMARINE_CRYSTALS;
    }

    @Override
    public int getPrice() {
        return 8;
    }

}
