package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BLOODBADGE extends SItem  {

    @Override
    public String getName() {
        return "Bloodbadge";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("You and killing","stuff in the rift,","name a more iconic","duo.")); 
    }

    @Override
    public String getId() {
        return "BLOODBADGE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.INK_SACK;
    }

    @Override
    public byte getDurability() {
        return 1;
    }

    @Override
    public Tier getTier() {
        return Tier.RARE;
    }

}
