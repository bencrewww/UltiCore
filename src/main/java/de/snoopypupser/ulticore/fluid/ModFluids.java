package de.snoopypupser.ulticore.fluid;

import de.snoopypupser.ulticore.UltiCore;
import de.snoopypupser.ulticore.block.ModBlocks;
import de.snoopypupser.ulticore.fluid.ModFluidTypes;
import de.snoopypupser.ulticore.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.intellij.lang.annotations.Flow;


public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(DeferredRegister.create(FlowingFluid), UltiCore.MOD_ID);

    public static final DeferredRegister<Fluid> SOURCE_SOAP_WATER = FLUIDS.register("soap_water_fluid",
            () -> new FlowingFluid(ModFluids.SOAP_WATER_FLUID_PROPERTIES) {
            });
    public static final DeferredRegister<FlowingFluid> FLOWING_SOAP_WATER = FLUIDS.register("flowing_soap_water",
            () -> new FlowingFluid(ModFluids.SOAP_WATER_FLUID_PROPERTIES) {
            });


    public static final FlowingFluid SOAP_WATER_FLUID_PROPERTIES = new FlowingFluid(
            ModFluidTypes.SOAP_WATER_FLUID_TYPE, SOURCE_SOAP_WATER, FLOWING_SOAP_WATER)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.SOAP_WATER_BLOCK)
            .bucket(ModItems.SOAP_WATER_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }


}