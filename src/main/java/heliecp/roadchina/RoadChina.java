package heliecp.roadchina;

import heliecp.roadchina.Registry.block;
import heliecp.roadchina.Registry.item;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricMaterialBuilder;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class RoadChina implements ModInitializer {
    //MATERIAL
    public static final Material STONE_MATERIAL = new FabricMaterialBuilder(MaterialColor.STONE).build();
    public static final String MOD_ID = "road_china";
    public static final Logger LOGGER = LogManager.getLogManager().getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        new item();
       new block();
    }
}
