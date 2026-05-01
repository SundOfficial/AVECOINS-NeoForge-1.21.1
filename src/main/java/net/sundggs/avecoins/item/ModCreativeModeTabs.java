package net.sundggs.avecoins.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sundggs.avecoins.AvecoinsMod;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AvecoinsMod.MOD_ID);

    public static final Supplier<CreativeModeTab> AVECOINS_ITEMS_TAB = CREATIVE_MODE_TAB.register("avecoins_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.IRONCOIN.get()))
            .title(Component.translatable("creativetab.avecoinsmod.items"))
            .displayItems((parameters, output) -> {
                output.accept(ModItems.COPPERCOIN);
                output.accept(ModItems.IRONCOIN);
                output.accept(ModItems.GOLDCOIN);
                output.accept(ModItems.DIAMONDCOIN);
                output.accept(ModItems.NETHERITECOIN);

            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
