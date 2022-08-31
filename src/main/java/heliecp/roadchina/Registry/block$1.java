package heliecp.roadchina.Registry;

import heliecp.roadchina.Creative$Tab;
import heliecp.roadchina.RoadChina;
import heliecp.roadchina.util.blocks.White_Arrow_1;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.material.Material;

public class block$1 {
    public static final White_Arrow_1 BLOCK_WHITE_ARROW_1;
    static {
        BLOCK_WHITE_ARROW_1 = registry(new White_Arrow_1(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_arrow_1");
    }
    private static <T extends net.minecraft.world.level.block.Block> T registry(T block, String path) {
        Registry.register(Registry.BLOCK, new ResourceLocation(RoadChina.MOD_ID, path), block);
        Registry.register(Registry.ITEM, new ResourceLocation(RoadChina.MOD_ID, path),
                new BlockItem(block,
                        new FabricItemSettings().group(Creative$Tab.AB_ROAD_MARKING).maxCount(64)));
        return block;
    }
}
