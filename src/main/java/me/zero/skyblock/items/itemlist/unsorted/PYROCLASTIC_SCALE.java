package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PYROCLASTIC_SCALE extends SItem implements  Sellable {

    @Override
    public String getName() {
        return "Pyroclastic Scale";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oMakes pretty","§7§o"drip"","§7§onecklaces,","§7§oaccording to the","§7§olocal youth.")); 
    }

    @Override
    public String getId() {
        return "PYROCLASTIC_SCALE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.PRISMARINE_SHARD;
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
        return 50;
    }

}
