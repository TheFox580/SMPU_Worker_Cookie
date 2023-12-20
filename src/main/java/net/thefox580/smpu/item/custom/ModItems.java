package net.thefox580.smpu.item.custom;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thefox580.smpu.SMPUnity;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SMPUnity.MOD_ID);

    public static final RegistryObject<Item> WORKER_SNACK = ITEMS.register("worker_snack",
            () -> new Item(new Item.Properties().food(ModFood.WORKER_SNACK)));

    public static final RegistryObject<Item> CERDU_PLUSH = ITEMS.register("cerdu_plush",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOLDEN_MELON = ITEMS.register("golden_melon",
            () -> new Item(new Item.Properties().food(ModFood.GOLDEN_MELON)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
