package net.thefox580.smpu.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFood {
    public static final FoodProperties WORKER_BITES = new FoodProperties.Builder().nutrition(4)
            .saturationMod(1.2F)
            .alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 1), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200), 1f).build();
    public static final FoodProperties SUSPICIOUS_WHITE_POWDER  = new FoodProperties.Builder().nutrition(2)
            .saturationMod(5F)
            .alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 3), 1f).build();

}
