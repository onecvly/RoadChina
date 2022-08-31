package heliecp.roadchina;

import heliecp.roadchina.Registry.block;
import heliecp.roadchina.Registry.block$1;
import heliecp.roadchina.Registry.item;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class Creative$Tab {
    public static final CreativeModeTab white_road = FabricItemGroupBuilder.build(new ResourceLocation(RoadChina.MOD_ID,"white_road"),() ->new ItemStack(block.BLOCK_WHITE_LINE_1));
    public static CreativeModeTab RoadChinaItem = FabricItemGroupBuilder.build(new ResourceLocation(RoadChina.MOD_ID,"road_china_item"),() ->new ItemStack(item.ITEM_WRENCH));
    public static CreativeModeTab AB_ROAD_MARKING = FabricItemGroupBuilder.build(new ResourceLocation(RoadChina.MOD_ID,"road_marking"),() ->new ItemStack(block$1.BLOCK_WHITE_ARROW_1));

}
