package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARTIFACT_OF_COINS extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "Artifact of Coins";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "ARTIFACT_OF_COINS"; 
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
        return Tier.RARE;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA1Mjk2MDY0MiwKICAicHJvZmlsZUlkIiA6ICI4ZjllYTBhNWJhOGE0NTNkYTgzNTBmYjRmNzVmOTJiOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJDeWJlck1pbm55IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzRkNzMxOGMyMWMyYTUzNjkzMjIyY2Q2MDE5MTUxOGE4ZTJhODg1OTU2ZGQwODIzYjYxNDJjOWNlNzdkMTM4MTEiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
