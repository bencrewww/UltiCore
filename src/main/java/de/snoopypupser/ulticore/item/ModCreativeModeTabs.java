package de.snoopypupser.ulticore.item;

import de.snoopypupser.ulticore.UltiCore;
import de.snoopypupser.ulticore.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UltiCore.MOD_ID);

    public static final Supplier<CreativeModeTab> ULTI_CORE_TAB = CREATIVE_MODE_TAB.register("ulti_core_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ULTICORE.get()))
                    .title(Component.translatable("Ulti Core"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ULTICORE);
                        output.accept(ModItems.SHARD_OF_RINGS);
                        output.accept(ModItems.RING_OF_FORTUNE);
                        output.accept(ModItems.FORTUNE_CORE);
                        output.accept(ModItems.CORESHARD);
                        output.accept(ModItems.RAWULT);
                        output.accept(ModItems.ULTINGOT);
                        output.accept(ModItems.RAWULTBUCKET);



                        output.accept(ModBlocks.DEEPSLATEULTORE);
                        output.accept(ModBlocks.ULTORE);
                        output.accept(ModBlocks.ULTBLOCK);
                        output.accept(ModBlocks.CRACKEDULTBLOCK);
                        output.accept(ModBlocks.CRACKEDDEEPSLATEULTBLOCK);
                        output.accept(ModBlocks.BROKENULTBLOCK);
                        output.accept(ModBlocks.BROKENDEEPSLATEULTBLOCK);

                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }


}
