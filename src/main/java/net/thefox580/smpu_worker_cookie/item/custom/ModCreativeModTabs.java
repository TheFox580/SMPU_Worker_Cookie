package net.thefox580.smpu_worker_cookie.item.custom;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thefox580.smpu_worker_cookie.SMPUnityWorkerCookie;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SMPUnityWorkerCookie.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CREATIVE_MOD_TAB = CREATIVE_MODE_TAB.register("creative_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WORKER_COOKIE.get()))
                    .title(Component.translatable("creativetab.creative_mod_tab"))
                    .displayItems().build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
