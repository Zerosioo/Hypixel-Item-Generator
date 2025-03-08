package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DIAMOND_SCARF_HEAD extends SItem implements ItemStatistics,SkullItem, Museum {

    @Override
    public String getName() {
        return "Diamond Scarf Head";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DIAMOND_SCARF_HEAD"; 
    }

    @Override
    public Material getMaterial() {
        return Material.SKULL_ITEM;
    }

    @Override
    public byte getDurability() {
        return 3;
    }

    @Override
    public Tier getTier() {
        return Tier.SPECIAL;
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
    public int getHealth() {
        return 70;
    }

    @Override
    public int getDefense() {
        return 30;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0NDE1MzQyMywKICAicHJvZmlsZUlkIiA6ICJhMmI1ZjhlM2MxZDI0ZmUzYTlkMzNiZTFhNzEzYTUwYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJOYXBpb0dvZCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80ZGE1Y2EyZjY4MDA1MTZhNjNkMjU4NzhlYjdhNzEzZTgwZDYzYjYyZjlmNmNhYjNmMzEwOTdmOTQ5NGI2MTIxIgogICAgfQogIH0KfQ==";
    }

}
