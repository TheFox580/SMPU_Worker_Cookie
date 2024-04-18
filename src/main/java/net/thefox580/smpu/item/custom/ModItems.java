package net.thefox580.smpu.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thefox580.smpu.SMPUnity;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SMPUnity.MOD_ID);

    public static final RegistryObject<Item> ENGLISH_WORKER_BITES = ITEMS.register("english_worker_bites",
            () -> new Item(new Item.Properties().food(ModFood.WORKER_BITES)));

    public static final RegistryObject<Item> SPANISH_WORKER_BITES = ITEMS.register("spanish_worker_bites",
            () -> new Item(new Item.Properties().food(ModFood.WORKER_BITES)));

    public static final RegistryObject<Item> PORTUGUESE_WORKER_BITES = ITEMS.register("portuguese_worker_bites",
            () -> new Item(new Item.Properties().food(ModFood.WORKER_BITES)));

    public static final RegistryObject<Item> FRENCH_WORKER_BITES = ITEMS.register("french_worker_bites",
            () -> new Item(new Item.Properties().food(ModFood.WORKER_BITES)));

    public static final RegistryObject<Item> CERDU_PLUSH = ITEMS.register("cerdu_plush",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TRAIN_TICKET = ITEMS.register("train_ticket",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> XP_PLUSH = ITEMS.register("xp_plush",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WORKER_HAMMER = ITEMS.register("worker_hammer",
            () -> new WorkerHammerItem(Tiers.WOOD, 0, 0F,
                    new Item.Properties()));

    public static final RegistryObject<Item> SUSPICIOUS_WHITE_POWDER = ITEMS.register("suspicious_white_powder",
            () -> new Suspicious_White_Powder(new Item.Properties().food(ModFood.SUSPICIOUS_WHITE_POWDER)));

    public static final RegistryObject<Item> MERFFINN_PLUSH = ITEMS.register("merffinn_plush",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
