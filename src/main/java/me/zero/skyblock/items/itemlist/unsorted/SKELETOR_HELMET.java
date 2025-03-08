package me.zero.skyblock.items.itemlist.unsorted;

import me.zero.skyblock.items.build.*;
import org.bukkit.Color;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SKELETOR_HELMET extends SItem implements SkullItem, Sellable {

    @Override
    public String getName() {
        return "Skeletor Helmet";
    }

    @Override
    public List<String> getLore() {
        return null; 
    }

    @Override
    public String getId() {
        return "SKELETOR_HELMET"; 
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
    public int getGearScore() {
        return 10;
    }

    @Override
    public int getPrice() {
        return 5000;
    }

    @Override
    public int getCritChance() {
        return 0;
    }

    @Override
    public int getCritDamage() {
        return 0;
    }

    @Override
    public int getHealth() {
        return 0;
    }

    @Override
    public int getDefense() {
        return 0;
    }

    @Override
    public String getTexture() {
        return "ewogICJ0aW1lc3RhbXAiIDogMTY5NTQyMTcwMTc5OSwKICAicHJvZmlsZUlkIiA6ICJhMzdlOGYyM2MyMTk0NjJiYjY3ZWUxY2I5OTM2YWY2NiIsCiAgInByb2ZpbGVOYW1lIiA6ICJEb29yYWxleSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS84OWQwNzRhZDliOTk3MTg3OWViMzI1YmRkZmYzNjc1ZjcyMjQ4NTZiZDZkNTY5ZmM4ZDQ4M2MxMzNkNzMwMDVkIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0=";
    }

}
