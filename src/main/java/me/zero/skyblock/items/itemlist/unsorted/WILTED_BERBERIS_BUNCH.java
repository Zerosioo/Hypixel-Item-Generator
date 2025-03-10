package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WILTED_BERBERIS_BUNCH extends SItem  {

    @Override
    public String getName() {
        return "Wilted Berberis Bunch";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("The plant equivalent","of... ALIEN revenant","viscera?")); 
    }

    @Override
    public String getId() {
        return "WILTED_BERBERIS_BUNCH"; 
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

}
