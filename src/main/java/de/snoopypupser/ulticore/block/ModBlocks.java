package de.snoopypupser.ulticore.block;

import de.snoopypupser.ulticore.UltiCore;
import de.snoopypupser.ulticore.fluid.ModFluidTypes;
import de.snoopypupser.ulticore.item.ModItems;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(UltiCore.MOD_ID);

    public static final DeferredBlock<Block> ULTORE = registerBlock("ultore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(50.0F, 1200.0F)
                    .sound(SoundType.STONE)
                    .destroyTime(30f)
                    .requiresCorrectToolForDrops()
            )
    );
    public static final DeferredBlock<Block> DEEPSLATEULTORE = registerBlock("deepslateultore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(50.0F, 1200.0F)
                    .sound(SoundType.DEEPSLATE)
                    .destroyTime(30f)
                    .requiresCorrectToolForDrops()
            )
    );
    public static final DeferredBlock<Block> ULTBLOCK = registerBlock("ultblock",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(70.0F, 1200.0F)
                    .sound(SoundType.NETHERITE_BLOCK)
                    .destroyTime(50f)
                    .requiresCorrectToolForDrops()
            )
    );
    public static final DeferredBlock<Block> CRACKEDULTBLOCK = registerBlock("crackedultblock",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(40.0F, 1200.0F)
                    .sound(SoundType.STONE)
                    .destroyTime(30f)
                    .requiresCorrectToolForDrops()
            )
    );
    public static final DeferredBlock<Block> CRACKEDDEEPSLATEULTBLOCK = registerBlock("crackeddeepslateultblock",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(40.0F, 1200.0F)
                    .sound(SoundType.DEEPSLATE)
                    .destroyTime(30f)
                    .requiresCorrectToolForDrops()
            )
    );
    public static final DeferredBlock<Block> BROKENULTBLOCK = registerBlock("brokenultblock",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(40.0F, 1200.0F)
                    .sound(SoundType.STONE)
                    .destroyTime(30f)
                    .requiresCorrectToolForDrops()
            )
    );
    public static final DeferredBlock<Block> BROKENDEEPSLATEULTBLOCK = registerBlock("brokendeepslateultblock",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(40.0F, 1200.0F)
                    .sound(SoundType.DEEPSLATE)
                    .destroyTime(30f)
                    .requiresCorrectToolForDrops()
            )
    );


    public static final DeferredBlock<LiquidBlock> SOAP_WATER_BLOCK = BLOCKS.register("soap_water_block",
            () -> LiquidBlock(ModFluids.SOURCE_SOAP_WATER, BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
