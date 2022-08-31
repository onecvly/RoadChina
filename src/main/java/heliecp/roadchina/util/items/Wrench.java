package heliecp.roadchina.util.items;

import net.minecraft.world.item.DebugStickItem;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class Wrench extends DebugStickItem {
    public Wrench(Properties settings) {
        super(settings);
    }
    @Override
    public boolean isFoil(@NotNull ItemStack itemStack) {
        return false;
    }
}
