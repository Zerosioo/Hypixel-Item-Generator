package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LARGE_AGRONOMY_SACK extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "Large Agronomy Sack";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "LARGE_AGRONOMY_SACK"; 
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
    public boolean isUnStackable() {
        return true;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcyMDA0NTQyNDMyOCwKICAicHJvZmlsZUlkIiA6ICI4MDBmNmU2ZGNiMTk0Yzc2OGE1OWU1Y2Q2MzFlNjI2YyIsCiAgInByb2ZpbGVOYW1lIiA6ICJ5dXl1dXUxIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2VmODM1Yjg5NDFmZTMxOTkzMTc0OWI4N2ZlOGU4NGM1ZDFmNGEyNzFiNWZiY2U1ZTcwMGE2MDAwNGQ4ODFmNzkiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
