package heliecp.roadchina.util.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class White_Arrow_1 extends Block_Road{
    public White_Arrow_1(Properties settings) {
        super(settings);
    }
    @SuppressWarnings("deprecation")
    @Override
    public VoxelShape getShape(BlockState blockState, @NotNull BlockGetter blockGetter, @NotNull BlockPos blockPos, @NotNull CollisionContext collisionContext){
        Direction dir = blockState.getValue(FACING);
        switch(dir) {
            case SOUTH:
            case NORTH:
            default:
                return Shapes.box(0.240, 0, -1, 0.760, 0.01, 2);
            case EAST:
            case WEST:
                return Shapes.box(-1, 0, 0.240, 2, 0.01, 0.760);
        }
    }
}

