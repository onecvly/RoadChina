package heliecp.roadchina;

import heliecp.roadchina.Registry.block$1;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class RoadClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(block$1.BLOCK_WHITE_ARROW_1, RenderType.cutout());
    }
}
