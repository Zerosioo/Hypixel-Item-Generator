package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JUNGLE_TABLE extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "Jungle Table";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "JUNGLE_TABLE"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0MTA2NDE0NCwKICAicHJvZmlsZUlkIiA6ICJhNWZlYWViNDdhYjA0ZDZiYTk2ZjMyOGJjMDQ3MDZjMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJYeW5kcmEyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzg1ZTFkMzA4ZGMzZDcyNTNmMzJlMzAwZWRhNGQwMDAzZmU2NGE1NmJmM2E1NDY2ZmQyMDExYjM1ZjQwM2RhM2IiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
