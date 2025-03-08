package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LIVING_METAL_ANVIL extends SItem  {

    @Override
    public String getName() {
        return "Living Metal Anchor";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("This anchor has a","life.","§7It likes music!","§7§7Its favorite","§7genre?","§7§7Heavy metal.","§7","§7§8Reed needs this","§8item.")); 
    }

    @Override
    public String getId() {
        return "LIVING_METAL_ANVIL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.ANVIL;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

    @Override
    public boolean isUnStackable() {
        return true;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

}
