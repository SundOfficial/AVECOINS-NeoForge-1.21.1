package net.sundggs.avecoins.item;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sundggs.avecoins.AvecoinsMod;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AvecoinsMod.MOD_ID);

    public static class CoinItem extends Item {
        private final String translationKey;

        public CoinItem(Properties properties, String coinName) {
            super(properties);
            this.translationKey = "tooltip.avecoins." + coinName;
        }

        @Override
        public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
            String key = Screen.hasShiftDown() ? translationKey + ".shift_down" : translationKey;
            Component fullText = Component.translatable(key);

            String[] lines = fullText.getString().split("\\n", -1);

            for (String line : lines) {
                if (line.isEmpty()) {
                    tooltipComponents.add(Component.empty());
                } else {
                    tooltipComponents.add(Component.literal(line));
                }
            }

            super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
        }
    }

    public static final DeferredItem<Item> COPPERCOIN = ITEMS.register("coppercoin",
            () -> new CoinItem(new Item.Properties(), "coppercoin"));

    public static final DeferredItem<Item> IRONCOIN = ITEMS.register("ironcoin",
            () -> new CoinItem(new Item.Properties(), "ironcoin"));

    public static final DeferredItem<Item> GOLDCOIN = ITEMS.register("goldcoin",
            () -> new CoinItem(new Item.Properties(), "goldcoin"));

    public static final DeferredItem<Item> DIAMONDCOIN = ITEMS.register("diamondcoin",
            () -> new CoinItem(new Item.Properties(), "diamondcoin"));

    public static final DeferredItem<Item> NETHERITECOIN = ITEMS.register("netheritecoin",
            () -> new CoinItem(new Item.Properties(), "netheritecoin"));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
