package net.thefox580.smpu_worker_cookie.item.custom;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thefox580.smpu_worker_cookie.SMPUnityWorkerCookie;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SMPUnityWorkerCookie.MOD_ID);

    public static final RegistryObject<Item> WORKER_COOKIE = ITEMS.register("worker_cookie",
            () -> new Item(new Item.Properties().food(ModFood.WORKER_COOKIE)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
