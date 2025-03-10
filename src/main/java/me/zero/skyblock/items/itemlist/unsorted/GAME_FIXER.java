package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GAME_FIXER extends SItem implements  Sellable, Museum {

    @Override
    public String getName() {
        return "Game Fixer";
    }

    @Override
    public List<String> getLore() {
        return new ArrayList(Arrays.asList("§7Given to","§7individuals who","§7broke the game too","§7many times. Thanks","§7for your great","§7help!")); 
    }

    @Override
    public String getId() {
        return "GAME_FIXER"; 
    }

    @Override
    public Material getMaterial() {
        return Material.WOOD_PICKAXE;
    }

    @Override
    public Tier getTier() {
        return Tier.VERY_SPECIAL;
    }

    @Override
    public boolean isGlowing() {
        return true;
    }

    @Override
    public boolean isMuseum() {
        return true;
    }

    @Override
    public Soulbound getSoulbound() {
        return Soulbound.COOP;
    }

    @Override
    public int getPrice() {
        return 777;
    }

}
