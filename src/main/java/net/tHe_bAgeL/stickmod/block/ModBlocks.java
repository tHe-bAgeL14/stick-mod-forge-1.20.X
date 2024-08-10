package net.tHe_bAgeL.stickmod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tHe_bAgeL.stickmod.StickMod;
import net.tHe_bAgeL.stickmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, StickMod.MODID);


    //Create blocks
    public static final RegistryObject<Block> STICK_BLOCK = registerBlock("stick_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.BAMBOO_WOOD)
            ));
    public static final RegistryObject<Block> REINFORCED_STICK_BLOCK = registerBlock("reinforced_stick_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.REINFORCED_DEEPSLATE)
                    .sound(SoundType.STONE)
                    .explosionResistance(600)
                    .requiresCorrectToolForDrops()
            ));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    //Registering item for block
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
