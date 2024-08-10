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

    //Create items
    public static final RegistryObject<Item> STICK_STICK = ITEMS.register("stick_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BEEG_STICK = ITEMS.register("beeg_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STICKY_STICK = ITEMS.register("sticky_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STONE_STICK = ITEMS.register("stone_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COAL_STICK = ITEMS.register("coal_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_STICK = ITEMS.register("copper_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_STICK = ITEMS.register("iron_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_STICK = ITEMS.register("gold_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_STICK = ITEMS.register("quartz_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_STICK = ITEMS.register("lapis_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_STICK = ITEMS.register("redstone_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_STICK = ITEMS.register("amethyst_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_STICK = ITEMS.register("diamond_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_STICK = ITEMS.register("emerald_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_STICK = ITEMS.register("netherite_stick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GODLY_STICK = ITEMS.register("godly_stick",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
