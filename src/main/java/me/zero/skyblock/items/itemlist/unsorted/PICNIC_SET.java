package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PICNIC_SET extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "Picnic Set";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PICNIC_SET"; 
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
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0NDA4MzM2OCwKICAicHJvZmlsZUlkIiA6ICIwNTljODIxYzhhODU0NGJiOWJiODVhOGMxNjVhYTc5YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJoZWxsc3RydWNrZWR6IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2E2MTgyYjRkMTNhMjAzMzhjODIzMWE5OThhNzcxNGRiNzU1Yzk2NGQxNjhlZDRjOGY3OWQ4MjU0ZmZmYTA2YWIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
