package heliecp.roadchina.util.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.swing.text.html.BlockView;

public class RoadSlab extends SlabBlock {
    protected static final VoxelShape BOTTOM_AABB = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
    protected static final VoxelShape TOP_AABB = Block.box(0.0D, 8.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    public RoadSlab(Properties settings) {
        super(settings);
    }
    public VoxelShape getShape(BlockState blockState, BlockView view, BlockPos pos) {
        SlabType slabtype = blockState.getValue(TYPE);
        return switch (slabtype) {
            case DOUBLE -> Shapes.block();
            case TOP -> TOP_AABB;
            default -> BOTTOM_AABB;
        };
    }
}
