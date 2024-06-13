package net.madfrost.epicureanrealms.item;

import net.madfrost.epicureanrealms.EpicureanRealms;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EpicureanRealms.MOD_ID);

    public static final RegistryObject<CreativeModeTab> EPICUREANREALMS_TAB = CREATIVE_MODE_TABS.register("epicureanrealms_tab",
            () -> CreativeModeTab.builder().icon(() -> new  ItemStack(ModItems.LUMINITE.get()))
                    .title(Component.translatable("creativetab.epicureanrealms_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.LUMINITE.get());
                        pOutput.accept(ModItems.RAW_LUMINITE.get());

                        pOutput.accept(Items.DIAMOND);

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
