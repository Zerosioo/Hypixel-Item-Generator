package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KEY_TO_KAT_SOUL extends SItem  {

    @Override
    public String getName() {
        return "Key to Infested House Soul";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("Hold this item in","your inventory to","use the soul in the","infested house.")); 
    }

    @Override
    public String getId() {
        return "KEY_TO_KAT_SOUL"; 
    }

    @Override
    public Material getMaterial() {
        return Material.GOLD_NUGGET;
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
