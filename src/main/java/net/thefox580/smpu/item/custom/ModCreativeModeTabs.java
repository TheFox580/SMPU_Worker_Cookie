package net.thefox580.smpu.item.custom;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thefox580.smpu.SMPUnity;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SMPUnity.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SMPU_TAB = CREATIVE_MOD_TABS.register("smpu_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ENGLISH_WORKER_BITES.get()))
                    .title(Component.translatable("creativetab.smpu_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ENGLISH_WORKER_BITES.get());
                        output.accept(ModItems.SPANISH_WORKER_BITES.get());
                        output.accept(ModItems.PORTUGUESE_WORKER_BITES.get());
                        output.accept(ModItems.FRENCH_WORKER_BITES.get());
                        output.accept(ModItems.CERDU_PLUSH.get());
                        output.accept(ModItems.MERFFINN_PLUSH.get());
                        output.accept(ModItems.XP_PLUSH.get());
                        output.accept(ModItems.TRAIN_TICKET.get());
                        output.accept(ModItems.WORKER_HAMMER.get());
                        output.accept(ModItems.SUSPICIOUS_WHITE_POWDER.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
