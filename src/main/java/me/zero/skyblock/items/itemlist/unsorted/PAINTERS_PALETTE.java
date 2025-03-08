package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PAINTERS_PALETTE extends SItem implements SkullItem {

    @Override
    public String getName() {
        return "Painter's Palette";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "PAINTERS_PALETTE"; 
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
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTcxNjQyMjM3MDc0MSwKICAicHJvZmlsZUlkIiA6ICJkMDQ3ZGY3ZjMzMzk0MmM1OTA3ODY5ZjIwYmI0YzlkMSIsCiAgInByb2ZpbGVOYW1lIiA6ICJleHBsaXloIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzYzMzU0OGM2OWI4ZjVjZDA5MzFkYTZiMTFlZDRjMTc1NmMxNWYwZjg5NmUxMDk1NjFlNzVhYWI0MjQ0NGRjMjkiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ==";
    }

}
