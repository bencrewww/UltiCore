package de.snoopypupser.ulticore.item;

import de.snoopypupser.ulticore.UltiCore;
import de.snoopypupser.ulticore.fluid.ModFluids;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluids;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(UltiCore.MOD_ID);

    public static final DeferredItem<Item> ULTICORE = ITEMS.register("ulticore",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FORTUNE_CORE = ITEMS.register("fortunecore",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RING_OF_FORTUNE = ITEMS.register("ringoffortune",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHARD_OF_RINGS = ITEMS.register("shardofrings",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CORESHARD = ITEMS.register("coreshard",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAWULT = ITEMS.register("rawult",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ULTINGOT = ITEMS.register("ultingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAWULTBUCKET = ITEMS.register("rawultbucket",
            () -> new Item(new Item.Properties()));

    // Custom Fluid
    public static final DeferredItem<Item> SOAP_WATER_BUCKET = ITEMS.register("soap_water_bucket",
            () -> new BucketItem(ModFluids.SOURCE_SOAP_WATER,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
