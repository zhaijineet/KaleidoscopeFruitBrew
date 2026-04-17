package net.zhaiji.kaleidoscope_fruit_brew.datagen;

import com.github.ysbbbbbb.kaleidoscopetavern.item.DrinkBlockItem;
import com.github.ysbbbbbb.kaleidoscopetavern.item.JuiceBucketItem;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.zhaiji.kaleidoscope_fruit_brew.KaleidoscopeFruitBrew;
import net.zhaiji.kaleidoscope_fruit_brew.register.KFBItem;

public class ItemModelProvider extends net.minecraftforge.client.model.generators.ItemModelProvider {
    public ItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, KaleidoscopeFruitBrew.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // 果汁桶物品模型
        for (RegistryObject<Item> entry : KFBItem.ITEM.getEntries()) {
            if (entry.get() instanceof JuiceBucketItem) {
                String path = entry.getId().getPath();
                getBuilder(entry.getId().toString())
                    .parent(getExistingFile(new ResourceLocation("item/generated")))
                    .texture("layer0", KaleidoscopeFruitBrew.of("item/bucket/" + path));
            }
        }
        // 果酒物品模型
        for (RegistryObject<Item> entry : KFBItem.ITEM.getEntries()) {
            if (entry.get() instanceof DrinkBlockItem) {
                String path = entry.getId().getPath();
                getBuilder(entry.getId().toString())
                    .parent(getExistingFile(new ResourceLocation("item/generated")))
                    .texture("layer0", KaleidoscopeFruitBrew.of("item/brew/" + path));
            }
        }
    }
}
