package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GLACITE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Glacite";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§oAn unnatural,","§onigh-unbreakable","§omaterial. Of those","§ounlucky few who","§ohave discovered","§owhere it","§ooriginates, none","§ohave lived to tell","§othe tale.")); 
    }

    @Override
    public String getId() {
        return "GLACITE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.PACKED_ICE;
    }

    @Override
    public int getPrice() {
        return 12;
    }

}
