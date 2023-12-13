package net.thefox580.smpu_worker_cookie.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFood {
    public static final FoodProperties WORKER_COOKIE = new FoodProperties.Builder().nutrition(4)
            .saturationMod(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 1), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200), 1f).build();

}
