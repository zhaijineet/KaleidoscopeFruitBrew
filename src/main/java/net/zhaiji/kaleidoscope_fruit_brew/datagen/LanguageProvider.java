package net.zhaiji.kaleidoscope_fruit_brew.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.material.Fluid;
import net.zhaiji.kaleidoscope_fruit_brew.KaleidoscopeFruitBrew;
import net.zhaiji.kaleidoscope_fruit_brew.register.KFBCreativeModeTab;
import net.zhaiji.kaleidoscope_fruit_brew.register.KFBBlock;
import net.zhaiji.kaleidoscope_fruit_brew.register.KFBFluid;
import net.zhaiji.kaleidoscope_fruit_brew.register.KFBItem;

public class LanguageProvider extends net.minecraftforge.common.data.LanguageProvider {
    public static final String EN_US = "en_us";
    public static final String ZH_CN = "zh_cn";

    public final String locale;

    public LanguageProvider(PackOutput output, String locale) {
        super(output, KaleidoscopeFruitBrew.MOD_ID, locale);
        this.locale = locale;
    }

    public void English_US() {
        add(KFBCreativeModeTab.TAB_TRANSLATABLE, "Kaleidoscope Fruit Brew");

        // 果汁流体
        add(KFBFluid.BAYBERRY_JUICE.get(), "Bayberry Juice");
        add(KFBFluid.BLUEBERRY_JUICE.get(), "Blueberry Juice");
        add(KFBFluid.CACTUS_JUICE.get(), "Cactus Juice");
        add(KFBFluid.CRANBERRY_JUICE.get(), "Cranberry Juice");
        add(KFBFluid.DURIAN_JUICE.get(), "Durian Juice");
        add(KFBFluid.FIG_JUICE.get(), "Fig Juice");
        add(KFBFluid.HAMIMELON_JUICE.get(), "Hamimelon Juice");
        add(KFBFluid.HAWBERRY_JUICE.get(), "Hawberry Juice");
        add(KFBFluid.KIWI_JUICE.get(), "Kiwi Juice");
        add(KFBFluid.LEMON_JUICE.get(), "Lemon Juice");
        add(KFBFluid.LYCHEE_JUICE.get(), "Lychee Juice");
        add(KFBFluid.MANGO_JUICE.get(), "Mango Juice");
        add(KFBFluid.MANGOSTEEN_JUICE.get(), "Mangosteen Juice");
        add(KFBFluid.ORANGE_JUICE.get(), "Orange Juice");
        add(KFBFluid.PEACH_JUICE.get(), "Peach Juice");
        add(KFBFluid.PEAR_JUICE.get(), "Pear Juice");
        add(KFBFluid.PERSIMMON_JUICE.get(), "Persimmon Juice");
        add(KFBFluid.PINEAPPLE_JUICE.get(), "Pineapple Juice");

        // 果汁桶
        add(KFBItem.BAYBERRY_BUCKET.get(), "Bayberry Juice Bucket");
        add(KFBItem.BLUEBERRY_BUCKET.get(), "Blueberry Juice Bucket");
        add(KFBItem.CACTUS_BUCKET.get(), "Cactus Juice Bucket");
        add(KFBItem.CRANBERRY_BUCKET.get(), "Cranberry Juice Bucket");
        add(KFBItem.DURIAN_BUCKET.get(), "Durian Juice Bucket");
        add(KFBItem.FIG_BUCKET.get(), "Fig Juice Bucket");
        add(KFBItem.HAMIMELON_BUCKET.get(), "Hamimelon Juice Bucket");
        add(KFBItem.HAWBERRY_BUCKET.get(), "Hawberry Juice Bucket");
        add(KFBItem.KIWI_BUCKET.get(), "Kiwi Juice Bucket");
        add(KFBItem.LEMON_BUCKET.get(), "Lemon Juice Bucket");
        add(KFBItem.LYCHEE_BUCKET.get(), "Lychee Juice Bucket");
        add(KFBItem.MANGO_BUCKET.get(), "Mango Juice Bucket");
        add(KFBItem.MANGOSTEEN_BUCKET.get(), "Mangosteen Juice Bucket");
        add(KFBItem.ORANGE_BUCKET.get(), "Orange Juice Bucket");
        add(KFBItem.PEACH_BUCKET.get(), "Peach Juice Bucket");
        add(KFBItem.PEAR_BUCKET.get(), "Pear Juice Bucket");
        add(KFBItem.PERSIMMON_BUCKET.get(), "Persimmon Juice Bucket");
        add(KFBItem.PINEAPPLE_BUCKET.get(), "Pineapple Juice Bucket");

        // 果酒方块
        add(KFBBlock.BAYBERRY_WINE.get(), "Bayberry Wine");
        add(KFBBlock.BLUEBERRY_WINE.get(), "Blueberry Wine");
        add(KFBBlock.CRANBERRY_WINE.get(), "Cranberry Wine");
        add(KFBBlock.DURIAN_WINE.get(), "Durian Wine");
        add(KFBBlock.FIG_WINE.get(), "Fig Wine");
        add(KFBBlock.GLOWBERRY_WINE.get(), "Glowberry Wine");
        add(KFBBlock.HAMIMELON_WINE.get(), "Hamimelon Wine");
        add(KFBBlock.HAWBERRY_WINE.get(), "Hawberry Wine");
        add(KFBBlock.KIWI_WINE.get(), "Kiwi Wine");
        add(KFBBlock.LEMON_WINE.get(), "Lemon Wine");
        add(KFBBlock.LYCHEE_WINE.get(), "Lychee Wine");
        add(KFBBlock.MANGO_WINE.get(), "Mango Wine");
        add(KFBBlock.MANGOSTEEN_WINE.get(), "Mangosteen Wine");
        add(KFBBlock.ORANGE_WINE.get(), "Orange Wine");
        add(KFBBlock.PEACH_WINE.get(), "Peach Wine");
        add(KFBBlock.PEAR_WINE.get(), "Pear Wine");
        add(KFBBlock.PERSIMMON_WINE.get(), "Persimmon Wine");
        add(KFBBlock.PINEAPPLE_WINE.get(), "Pineapple Wine");
        add(KFBBlock.TEQUILA.get(), "Tequila");
    }

    public void Chinese_CN() {
        add(KFBCreativeModeTab.TAB_TRANSLATABLE, "森罗物语：果酒");

        // 果汁流体
        add(KFBFluid.BAYBERRY_JUICE.get(), "杨梅汁");
        add(KFBFluid.BLUEBERRY_JUICE.get(), "蓝莓汁");
        add(KFBFluid.CACTUS_JUICE.get(), "仙人掌汁");
        add(KFBFluid.CRANBERRY_JUICE.get(), "蔓越莓汁");
        add(KFBFluid.DURIAN_JUICE.get(), "榴莲汁");
        add(KFBFluid.FIG_JUICE.get(), "无花果汁");
        add(KFBFluid.HAMIMELON_JUICE.get(), "哈密瓜汁");
        add(KFBFluid.HAWBERRY_JUICE.get(), "山楂汁");
        add(KFBFluid.KIWI_JUICE.get(), "猕猴桃汁");
        add(KFBFluid.LEMON_JUICE.get(), "柠檬汁");
        add(KFBFluid.LYCHEE_JUICE.get(), "荔枝汁");
        add(KFBFluid.MANGO_JUICE.get(), "芒果汁");
        add(KFBFluid.MANGOSTEEN_JUICE.get(), "山竹汁");
        add(KFBFluid.ORANGE_JUICE.get(), "橘子汁");
        add(KFBFluid.PEACH_JUICE.get(), "水蜜桃汁");
        add(KFBFluid.PEAR_JUICE.get(), "梨子汁");
        add(KFBFluid.PERSIMMON_JUICE.get(), "柿子汁");
        add(KFBFluid.PINEAPPLE_JUICE.get(), "菠萝汁");

        // 果汁桶
        add(KFBItem.BAYBERRY_BUCKET.get(), "杨梅果汁桶");
        add(KFBItem.BLUEBERRY_BUCKET.get(), "蓝莓果汁桶");
        add(KFBItem.CACTUS_BUCKET.get(), "仙人掌果汁桶");
        add(KFBItem.CRANBERRY_BUCKET.get(), "蔓越莓果汁桶");
        add(KFBItem.DURIAN_BUCKET.get(), "榴莲果汁桶");
        add(KFBItem.FIG_BUCKET.get(), "无花果果汁桶");
        add(KFBItem.HAMIMELON_BUCKET.get(), "哈密瓜果汁桶");
        add(KFBItem.HAWBERRY_BUCKET.get(), "山楂果汁桶");
        add(KFBItem.KIWI_BUCKET.get(), "猕猴桃果汁桶");
        add(KFBItem.LEMON_BUCKET.get(), "柠檬果汁桶");
        add(KFBItem.LYCHEE_BUCKET.get(), "荔枝果汁桶");
        add(KFBItem.MANGO_BUCKET.get(), "芒果果汁桶");
        add(KFBItem.MANGOSTEEN_BUCKET.get(), "山竹果汁桶");
        add(KFBItem.ORANGE_BUCKET.get(), "橘子果汁桶");
        add(KFBItem.PEACH_BUCKET.get(), "水蜜桃果汁桶");
        add(KFBItem.PEAR_BUCKET.get(), "梨子果汁桶");
        add(KFBItem.PERSIMMON_BUCKET.get(), "柿子果汁桶");
        add(KFBItem.PINEAPPLE_BUCKET.get(), "菠萝果汁桶");

        // 果酒方块
        add(KFBBlock.BAYBERRY_WINE.get(), "杨梅酒");
        add(KFBBlock.BLUEBERRY_WINE.get(), "蓝莓酒");
        add(KFBBlock.CRANBERRY_WINE.get(), "蔓越莓酒");
        add(KFBBlock.DURIAN_WINE.get(), "榴莲酒");
        add(KFBBlock.FIG_WINE.get(), "无花果酒");
        add(KFBBlock.GLOWBERRY_WINE.get(), "发光浆果酒");
        add(KFBBlock.HAMIMELON_WINE.get(), "哈密瓜酒");
        add(KFBBlock.HAWBERRY_WINE.get(), "山楂酒");
        add(KFBBlock.KIWI_WINE.get(), "猕猴桃酒");
        add(KFBBlock.LEMON_WINE.get(), "柠檬酒");
        add(KFBBlock.LYCHEE_WINE.get(), "荔枝酒");
        add(KFBBlock.MANGO_WINE.get(), "芒果酒");
        add(KFBBlock.MANGOSTEEN_WINE.get(), "山竹酒");
        add(KFBBlock.ORANGE_WINE.get(), "橘子酒");
        add(KFBBlock.PEACH_WINE.get(), "水蜜桃酒");
        add(KFBBlock.PEAR_WINE.get(), "梨子酒");
        add(KFBBlock.PERSIMMON_WINE.get(), "柿子酒");
        add(KFBBlock.PINEAPPLE_WINE.get(), "菠萝酒");
        add(KFBBlock.TEQUILA.get(), "龙舌兰酒");
    }

    public void add(Fluid key, String name) {
        add(key.getFluidType().getDescriptionId(), name);
    }

    @Override
    protected void addTranslations() {
        switch (this.locale) {
            case EN_US -> this.English_US();
            case ZH_CN -> this.Chinese_CN();
        }
    }
}
