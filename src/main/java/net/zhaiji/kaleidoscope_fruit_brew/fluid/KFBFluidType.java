package net.zhaiji.kaleidoscope_fruit_brew.fluid;

import net.minecraft.Util;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;
import net.minecraftforge.common.SoundActions;
import net.minecraftforge.fluids.FluidType;
import net.zhaiji.kaleidoscope_fruit_brew.KaleidoscopeFruitBrew;

import java.util.function.Consumer;

public class KFBFluidType extends FluidType {
    private final ResourceLocation stillTexture;
    private final ResourceLocation flowingTexture;

    public KFBFluidType(String id) {
        super(FluidType.Properties.create()
            .descriptionId(Util.makeDescriptionId("block", KaleidoscopeFruitBrew.of(id)))
            .fallDistanceModifier(0)
            .canExtinguish(true)
            .canConvertToSource(false)
            .supportsBoating(true)
            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
            .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
            .canHydrate(true));
        this.stillTexture = KaleidoscopeFruitBrew.of("block/juice/" + id + "_still");
        this.flowingTexture = KaleidoscopeFruitBrew.of("block/juice/" + id + "_flow");
    }

    @Override
    public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
        consumer.accept(new IClientFluidTypeExtensions() {
            @Override
            public ResourceLocation getStillTexture() {
                return stillTexture;
            }

            @Override
            public ResourceLocation getFlowingTexture() {
                return flowingTexture;
            }
        });
    }
}
