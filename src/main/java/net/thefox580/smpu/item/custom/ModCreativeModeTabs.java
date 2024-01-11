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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WORKER_SNACK.get()))
                    .title(Component.translatable("creativetab.smpu_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.WORKER_SNACK.get());
                        output.accept(ModItems.CERDU_PLUSH.get());
                        output.accept(ModItems.GOLDEN_MELON.get());
                        output.accept(ModItems.TRAIN_TICKET.get());
                        output.accept(ModItems.BLOOD_AMETHYST_SHARD.get());
                        output.accept(ModBlocks.BLOOD_AMETHYST_BLOCK.get());
                        output.accept(ModItems.KNOCKBACK_HAMMER.get());
                        output.accept(ModItems.XP_PLUSH.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
