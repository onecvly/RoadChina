package heliecp.roadchina;

import heliecp.roadchina.Registry.block;
import heliecp.roadchina.Registry.item;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Creative$Tab {
    public static ItemGroup white_road = FabricItemGroupBuilder.build(new Identifier(RoadChina.MOD_ID,"white_road"),() ->new ItemStack(block.BLOCK_WHITE_LINE_1));
    public static ItemGroup roadChinaItem = FabricItemGroupBuilder.build(new Identifier(RoadChina.MOD_ID,"road_china_item"),() ->new ItemStack(item.ITEM_WRENCH));

}
