package heliecp.roadchina.Registry;

import heliecp.roadchina.Creative$Tab;
import heliecp.roadchina.RoadChina;
import heliecp.roadchina.block.BlockLine;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class block {
    //road
    public static final RoadChinablock BLOCK_ROAD;
    //BlockLine
    public static final BlockLine BLOCK_WHITE_LINE_1;
    public static final BlockLine BLOCK_WHITE_LINE_2;
    public static final BlockLine BLOCK_WHITE_LINE_3;
    public static final BlockLine BLOCK_WHITE_LINE_4;
    public static final BlockLine BLOCK_WHITE_LINE_5;
    public static final BlockLine BLOCK_WHITE_LINE_6;
    public static final BlockLine BLOCK_WHITE_LINE_7;
    // BlockLineSlab
  //  public static final BlockLineSlab BLOCK_WHITE_LINE_1_SLAB;
   // public static final BlockLineSlab BLOCK_WHITE_LINE_2_SLAB;
 //   public static final BlockLineSlab BLOCK_WHITE_LINE_3_SLAB;
  //  public static final BlockLineSlab BLOCK_WHITE_LINE_4_SLAB;
  //  public static final BlockLineSlab BLOCK_WHITE_LINE_5_SLAB;
 //   public static final BlockLineSlab BLOCK_WHITE_LINE_6_SLAB;
  //  public static final BlockLineSlab BLOCK_WHITE_LINE_7_SLAB;
    //blockarrow
   // public static final BlockArrow1 BLOCK_WHITE_ARROW_1;
    static {
        //road
        BLOCK_ROAD = registry(new RoadChinablock(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"block_road");
        //BlockLine
        BLOCK_WHITE_LINE_1 = registry(new BlockLine(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_1");
        BLOCK_WHITE_LINE_2 = registry(new BlockLine(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_2");
        BLOCK_WHITE_LINE_3 = registry(new BlockLine(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_3");
        BLOCK_WHITE_LINE_4 = registry(new BlockLine(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_4");
        BLOCK_WHITE_LINE_5 = registry(new BlockLine(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_5");
        BLOCK_WHITE_LINE_6 = registry(new BlockLine(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_6");
        BLOCK_WHITE_LINE_7 = registry(new BlockLine(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_7");
        //BlockLineSlab
       // BLOCK_WHITE_LINE_1_SLAB = registry(new BlockLineSlab(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_1_slab");
       // BLOCK_WHITE_LINE_2_SLAB = registry(new BlockLineSlab(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_2_slab");
       // BLOCK_WHITE_LINE_3_SLAB = registry(new BlockLineSlab(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_3_slab");
      //  BLOCK_WHITE_LINE_4_SLAB = registry(new BlockLineSlab(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_4_slab");
      //  BLOCK_WHITE_LINE_5_SLAB = registry(new BlockLineSlab(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_5_slab");
      //  BLOCK_WHITE_LINE_6_SLAB = registry(new BlockLineSlab(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_6_slab");
      //  BLOCK_WHITE_LINE_7_SLAB = registry(new BlockLineSlab(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_line_7_slab");
        //blockarrow
      //  BLOCK_WHITE_ARROW_1 = registry(new BlockArrow1(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(65.0f).strength(4.0f)),"white_arrow_1");
    }

    private static <T extends Block> T registry(T block, String path) {
        Registry.register(Registry.BLOCK, new Identifier(RoadChina.MOD_ID, path), block);
        Registry.register(Registry.ITEM, new Identifier(RoadChina.MOD_ID, path), new BlockItem(block, new FabricItemSettings().group(Creative$Tab.white_road)));
        return block;
    }
}
