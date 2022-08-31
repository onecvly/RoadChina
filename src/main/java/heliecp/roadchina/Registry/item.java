package heliecp.roadchina.Registry;

import heliecp.roadchina.Creative$Tab;
import heliecp.roadchina.RoadChina;
import heliecp.roadchina.util.items.Wrench;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class item {
        public static Wrench ITEM_WRENCH;
        static {
             ITEM_WRENCH = registry(new Wrench(new FabricItemSettings().group(Creative$Tab.RoadChinaItem).maxCount(1)),"wrench");
        }
     //   public static void register(){
     //register(ITEM_WRENCH, "wrench");
      //  }
      //  public static void init(){
      //          ITEM_WRENCH = new DebugStickItem(new FabricItemSettings().group(Creative$Tab.roadChinaItem).maxCount(1));
     //   }
     private static <T extends Item> T registry(T item, String path) {
             Registry.register(Registry.ITEM, new ResourceLocation(RoadChina.MOD_ID, path), item);
             return item;
     }
}
