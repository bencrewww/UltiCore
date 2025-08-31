package de.snoopypupser.ulticore.fluid;

import com.tterrag.registrate.util.entry.FluidEntry;
import de.snoopypupser.ulticore.UltiCore;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.SoundAction;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import org.joml.Vector3f;

public class ModFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation(UltiCore.MOD_ID,"block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation(UltiCore.MOD_ID,"block/water_flow");
    public static final ResourceLocation SOAP_OVERLAY_RL = new ResourceLocation(UltiCore.MOD_ID, "misc/in_soap_water.png");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, UltiCore.MOD_ID);

    public static final DeferredRegister<FluidType> SOAP_WATER_FLUID_TYPE = register("soap_water_fluid",
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK);




    private static FluidEntry<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, SOAP_OVERLAY_RL, 0xA1E038D0, new Vector3f(224f / 255f, 56f / 255f, 208f /255f), properties));
    }



    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }










}
