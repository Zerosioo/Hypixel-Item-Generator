package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RED_THORNLEAF extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Red Thornleaf";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oA leaf that","§7§ogrows on the","§7§oground. Really","§7§opushing the","§7§oenvelope.")); 
    }

    @Override
    public String getId() {
        return "RED_THORNLEAF"; 
    }

    @Override
    public Material getMaterial() {
        return Material.DEAD_BUSH;
    }

    @Override
    public Tier getTier() {
        return Tier.UNCOMMON;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public int getPrice() {
        return 20;
    }

}
