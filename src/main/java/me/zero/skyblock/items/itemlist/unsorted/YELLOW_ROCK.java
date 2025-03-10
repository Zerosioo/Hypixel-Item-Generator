package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class YELLOW_ROCK extends SItem  {

    @Override
    public String getName() {
        return "§eYellow Rock";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oA little rough","§7§oaround the","§7§oedges, but","§7§obeauty can be","§7§ofound within.")); 
    }

    @Override
    public String getId() {
        return "YELLOW_ROCK"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_NUGGET;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

}
