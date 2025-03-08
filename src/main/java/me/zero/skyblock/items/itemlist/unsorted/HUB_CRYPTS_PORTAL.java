package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HUB_CRYPTS_PORTAL extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "Portal to the Hub Crypts";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "HUB_CRYPTS_PORTAL"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxOTU5MDQ2MzA1NywKICAicHJvZmlsZUlkIiA6ICIxNzM1MGE5OWQ3MzQ0NDBjYTY0YzJjMDU3YTNjMWM4ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJHaWxkZWRoZXJvNTY5MSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xZWZlMWQ0ODFjMjRjZGI2YmUwN2NiMWI3ZTEzODdhMzA2NTg5N2EwNTM0ZTUzYWY0ZGI2OTRlN2RhNjU4YWI2IgogICAgfQogIH0KfQ==";
    }

}
