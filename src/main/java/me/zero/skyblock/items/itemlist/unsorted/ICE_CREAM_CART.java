package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ICE_CREAM_CART extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "Ice Cream Cart";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ICE_CREAM_CART"; 
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
        return Tier.EPIC;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY1NTQwMDc0NTA0NSwKICAicHJvZmlsZUlkIiA6ICIxNGU0NGFmZjZhODg0ZGFmOGEyNDUzYzIwZDVhNTE1YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJKYW4yazE3IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzM2ZGY5YzIxMmE4YWQ4MjU0NWYwZTU5NDEwYmZhOTkwZmYzZTdhYWJlOGJhOGM5ZmRjM2Q0YTVlYTI3MjI2NDgiCiAgICB9CiAgfQp9";
    }

}
