package heliecp.roadchina;

import heliecp.roadchina.Registry.block;
import heliecp.roadchina.Registry.item;
import net.fabricmc.api.ModInitializer;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class RoadChina implements ModInitializer {
    public static final String MOD_ID = "road_china";
    public static final Logger LOGGER = LogManager.getLogManager().getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        item.onLoad();
        new block();
    }
}
