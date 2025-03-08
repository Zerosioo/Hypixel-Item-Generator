package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CITRINE_CRYSTAL extends SItem implements SkullItem, Museum {

    @Override
    public String getName() {
        return "Citrine Crystal";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "CITRINE_CRYSTAL"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxMDExNTgzMzMzNiwKICAicHJvZmlsZUlkIiA6ICI3MzE4MWQxZDRjYWQ0ZmU0YTcxNWNjNmUxOGNjYzVkNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJaZmVybjRuZGl0byIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80OGRiNzFlM2FjODk0ZDE2NzhiN2UxMzcyOGIyMjNkNWRjYjkzMjQyZTQxMzQ3MjA2MjFjYTZmODkxYTRlNmYiCiAgICB9CiAgfQp9";
    }

}
