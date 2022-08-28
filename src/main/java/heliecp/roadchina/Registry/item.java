package heliecp.roadchina.Registry;

import heliecp.roadchina.Creative$Tab;
import heliecp.roadchina.RoadChina;
import net.minecraft.item.DebugStickItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class item {

        public static final DebugStickItem ITEM_WRENCH = new DebugStickItem(new Item.Settings().group(Creative$Tab.roadChinaItem).maxCount(1));
        public static void onLoad(){
                Registry.register(Registry.ITEM,new Identifier(RoadChina.MOD_ID,"wrench"),ITEM_WRENCH);
        }

}
