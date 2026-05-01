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

    public static final DeferredItem<Item> COPPERCOIN = ITEMS.register("coppercoin",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.avecoins.coppercoin.shift_down"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.avecoins.coppercoin"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> IRONCOIN = ITEMS.register("ironcoin",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.avecoins.ironcoin.shift_down"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.avecoins.ironcoin"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> GOLDCOIN = ITEMS.register("goldcoin",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.avecoins.goldcoin.shift_down"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.avecoins.goldcoin"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> DIAMONDCOIN = ITEMS.register("diamondcoin",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.avecoins.diamondcoin.shift_down"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.avecoins.diamondcoin"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<Item> NETHERITECOIN = ITEMS.register("netheritecoin",
            () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.avecoins.netheritecoin.shift_down"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.avecoins.netheritecoin"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
