package me.zero.skyblock;

public interface ItemStatistics {

    // Core Combat Stats
    default int getDamage() { return 0; }
    default int getStrength() { return 0; }
    default int getCritChance() { return 0; }
    default int getCritDamage() { return 0; }
    default int getFerocity() { return 0; }
    default int getAttackSpeed() { return 0; } // Sometimes called "Bonus Attack Speed"

    // Survivability Stats
    default int getHealth() { return 0; }
    default int getDefense() { return 0; }
    default int getTrueDefense() { return 0; }
    default int getHealthRegeneration() { return 0; }
    default int getVitality() { return 0; }

    // Magic & Utility
    default int getIntelligence() { return 0; }
    default int getAbilityDamage() { return 0; }
    default int getSwingRange() { return 0; }

    // Movement & Luck
    default int getSpeed() { return 0; }
    default int getMagicFind() { return 0; }
    default int getPetLuck() { return 0; }

    // Gathering Stats
    default int getFarmingFortune() { return 0; }
    default int getMiningFortune() { return 0; }
    default int getForagingFortune() { return 0; }
    default int getFishingFortune() { return 0; }
    default int getMiningSpeed() { return 0; }
    default int getFishingSpeed() { return 0; }
    default int getPristine() { return 0; } // Mining gemstone stat

    // Fishing & Sea
    default int getSeaCreatureChance() { return 0; }
    
    // Wisdoms
    default int getCombatWisdom() { return 0; }
    default int getMiningWisdom() { return 0; }
    default int getFarmingWisdom() { return 0; }
    default int getForagingWisdom() { return 0; }
    default int getFishingWisdom() { return 0; }
    default int getEnchantingWisdom() { return 0; }
    default int getAlchemyWisdom() { return 0; }
    default int getCarpentryWisdom() { return 0; }
    default int getRunecraftingWisdom() { return 0; }
    default int getSocialWisdom() { return 0; }
    default int getTamingWisdom() { return 0; }

    // Resistance Stats
    default int getFireResistance() { return 0; }
    default int getFallResistance() { return 0; }
    default int getExplosionResistance() { return 0; }
    default int getProjectileResistance() { return 0; }

    // Rift Stats (if applicable)
    default int getRiftMana() { return 0; }
    default int getManaRegeneration() { return 0; }
    default int getRiftTime() { return 0; }

    default int getMiningPower() { return 0; }
}