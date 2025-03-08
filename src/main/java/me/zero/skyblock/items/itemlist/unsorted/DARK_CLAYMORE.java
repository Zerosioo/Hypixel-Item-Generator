package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DARK_CLAYMORE extends SItem implements ItemStatistics, Sellable {

    @Override
    public String getName() {
        return "Dark Claymore";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7§oThat thing was","§7§otoo big to be","§7§ocalled a sword,","§7§oit was more like","§7§oa large hunk of","§7§ostone.")); 
    }

    @Override
    public String getId() {
        return "DARK_CLAYMORE"; 
    }

    @Override
    public Material getMaterial() {
        return Material.STONE_SWORD;
    }

    @Override
    public Tier getTier() {
        return Tier.LEGENDARY;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public int getDamage() {
        return 500;
    }

    @Override
    public int getCritDamage() {
        return 30;
    }

    @Override
    public int getSwingRange() {
        return 2;
    }

}
