package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HARD_STONE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Hard Stone";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7A condensed form","§7of rock only found","§7at extreme depths.")); 
    }

    @Override
    public String getId() {
        return "HARD_STONE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STONE;
    }

    @Override
    public int getPrice() {
        return 1;
    }

}
