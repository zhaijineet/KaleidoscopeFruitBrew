package net.zhaiji.kaleidoscope_fruit_brew.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

public class DataGenHandler {
    public static void handlerGatherDataEvent(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new BlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new LanguageProvider(packOutput, LanguageProvider.EN_US));
        generator.addProvider(event.includeClient(), new LanguageProvider(packOutput, LanguageProvider.ZH_CN));

        generator.addProvider(event.includeServer(), new BarrelRecipeProvider(packOutput));
        generator.addProvider(event.includeServer(), new DrinkEffectDataProvider(packOutput));
        // 本项目无 block tag 需求，传入空 block lookup 占位
        generator.addProvider(event.includeServer(), new KFBItemTagsProvider(
                packOutput, lookupProvider,
                CompletableFuture.completedFuture(TagsProvider.TagLookup.empty()),
                existingFileHelper
        ));
    }
}
