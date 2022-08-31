package heliecp.roadchina.Registry;

import heliecp.roadchina.Creative$Tab;
import heliecp.roadchina.RoadChina;
import heliecp.roadchina.util.blocks.Block_Road;
import heliecp.roadchina.util.blocks.LineSlab;
import heliecp.roadchina.util.blocks.RoadSlab;
import heliecp.roadchina.util.items.RoadChinablock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.material.Material;

public class block {
    //road
    public static final RoadChinablock BLOCK_ROAD;
    //road_slab
    public static final RoadSlab ROAD_SLAB;
    //BlockLine
    public static final Block_Road BLOCK_WHITE_LINE_1;
    public static final Block_Road BLOCK_WHITE_LINE_2;
    public static final Block_Road BLOCK_WHITE_LINE_3;
    public static final Block_Road BLOCK_WHITE_LINE_4;
    public static final Block_Road BLOCK_WHITE_LINE_5;
    public static final Block_Road BLOCK_WHITE_LINE_6;
    public static final Block_Road BLOCK_WHITE_LINE_7;

    // BlockLineSlab
     public static final LineSlab BLOCK_WHITE_LINE_1_SLAB;
     public static final LineSlab BLOCK_WHITE_LINE_2_SLAB;
     public static final LineSlab BLOCK_WHITE_LINE_3_SLAB;
     public static final LineSlab BLOCK_WHITE_LINE_4_SLAB;
     public static final LineSlab BLOCK_WHITE_LINE_5_SLAB;
     public static final LineSlab BLOCK_WHITE_LINE_6_SLAB;
     public static final LineSlab BLOCK_WHITE_LINE_7_SLAB;

      static {
        //road
         BLOCK_ROAD = registry(new RoadChinablock(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"asphalt_road");
        //road_slab
         ROAD_SLAB = registry(new RoadSlab(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"asphalt_road_slab");
        //BlockLine
         BLOCK_WHITE_LINE_1 = registry(new Block_Road(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_1");
         BLOCK_WHITE_LINE_2 = registry(new Block_Road(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_2");
         BLOCK_WHITE_LINE_3 = registry(new Block_Road(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_3");
         BLOCK_WHITE_LINE_4 = registry(new Block_Road(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_4");
         BLOCK_WHITE_LINE_5 = registry(new Block_Road(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_5");
         BLOCK_WHITE_LINE_6 = registry(new Block_Road(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_6");
         BLOCK_WHITE_LINE_7 = registry(new Block_Road(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_7");
        //BlockLineSlab
        BLOCK_WHITE_LINE_1_SLAB = registry(new LineSlab(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_1_slab");
        BLOCK_WHITE_LINE_2_SLAB = registry(new LineSlab(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_2_slab");
        BLOCK_WHITE_LINE_3_SLAB = registry(new LineSlab(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_3_slab");
        BLOCK_WHITE_LINE_4_SLAB = registry(new LineSlab(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_4_slab");
        BLOCK_WHITE_LINE_5_SLAB = registry(new LineSlab(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_5_slab");
        BLOCK_WHITE_LINE_6_SLAB = registry(new LineSlab(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_6_slab");
        BLOCK_WHITE_LINE_7_SLAB = registry(new LineSlab(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_7_slab");
    }
    private static <T extends net.minecraft.world.level.block.Block> T registry(T block, String path) {
  Registry.register(Registry.BLOCK, new ResourceLocation(RoadChina.MOD_ID, path), block);
    Registry.register(Registry.ITEM, new ResourceLocation(RoadChina.MOD_ID, path),
          new BlockItem(block,
                   new FabricItemSettings().group(Creative$Tab.white_road).maxCount(64)));
      return block;
     }
}