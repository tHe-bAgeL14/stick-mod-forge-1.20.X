package net.tHe_bAgeL.stickmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.tHe_bAgeL.stickmod.StickMod;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StickMod.MODID);

    public static final RegistryObject<CreativeModeTab> STICK_TAB = CREATIVE_MODE_TABS.register("stick_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BEEGSTICK.get()))
                    .title(Component.translatable("creativetab.stick_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Items.STICK);
                        for(RegistryObject<Item> item: ModItems.ITEMS.getEntries()){
                            pOutput.accept(item.get());
                        }
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
