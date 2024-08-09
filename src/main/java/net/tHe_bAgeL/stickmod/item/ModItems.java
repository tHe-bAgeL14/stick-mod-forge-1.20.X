package net.tHe_bAgeL.stickmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tHe_bAgeL.stickmod.StickMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StickMod.MODID);


    public static final RegistryObject<Item> STICKSTICK = ITEMS.register("stickstick",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BEEGSTICK = ITEMS.register("beegstick",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
