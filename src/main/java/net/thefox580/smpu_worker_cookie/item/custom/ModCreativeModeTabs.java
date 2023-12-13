package net.thefox580.smpu_worker_cookie.item.custom;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thefox580.smpu_worker_cookie.SMPUnityWorkerCookie;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SMPUnityWorkerCookie.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SMPU_WORKER_COOKIE_TAB = CREATIVE_MOD_TABS.register("smpu_worker_cookie_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WORKER_COOKIE.get()))
                    .title(Component.translatable("creativetab.smpu_worker_cookie_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.WORKER_COOKIE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
