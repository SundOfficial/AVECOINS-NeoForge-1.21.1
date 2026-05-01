package net.sundggs.avecoins;

import net.sundggs.avecoins.item.ModCreativeModeTabs;
import net.sundggs.avecoins.item.ModItems;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(AvecoinsMod.MOD_ID)
public class AvecoinsMod {
    public static final String MOD_ID = "avecoins";
    public static final Logger LOGGER = LogUtils.getLogger();

    public AvecoinsMod(IEventBus modEventBus) {
        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
    }
}
