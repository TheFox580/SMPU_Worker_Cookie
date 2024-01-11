package net.thefox580.smpu.item.custom;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thefox580.smpu.SMPUnity;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(ForgeRegistries.POTIONS, SMPUnity.MOD_ID);

    public static final RegistryObject<Potion> WORKER_BOOST = POTIONS.register("worker_boost",
            () -> new Potion(
                    new MobEffectInstance(MobEffects.ABSORPTION, 2400),
                    new MobEffectInstance(MobEffects.REGENERATION, 100, 1),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200)
            ));

    public static void register(IEventBus eventBus){
        POTIONS.register(eventBus);
    }
}
