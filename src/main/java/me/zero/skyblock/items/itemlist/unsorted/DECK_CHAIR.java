package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DECK_CHAIR extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "Deck Chair";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "DECK_CHAIR"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcwNTQzMzIwNDgxMSwKICAicHJvZmlsZUlkIiA6ICJlZTZiNDJmN2Y2NjM0NjhhODgyNTdjNmQ3ZjgwNWE4ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICI1Njk1IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzNiZjc2MTE4ODJkY2Y4OTY5ZTQ4MWZlNjY2MmE4MWNiMmQzMzJiNzUwMWU3Yjk4ZThmYWUzMGZiMzRmOTY0YTciLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
