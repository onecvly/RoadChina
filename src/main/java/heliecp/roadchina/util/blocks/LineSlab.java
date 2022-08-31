package heliecp.roadchina.util.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import static net.minecraft.world.level.block.state.properties.BlockStateProperties.WATERLOGGED;

public class LineSlab extends Block_Road implements SimpleWaterloggedBlock {
    public static final EnumProperty<SlabType> TYPE = SlabBlock.TYPE;

    protected static final VoxelShape SLAB_BOTTOM = net.minecraft.world.level.block.Block.box(0.0D,0.0D,0.0D,16.0D,8.0D,16.0D);
    protected static final VoxelShape SLAB_TOP = net.minecraft.world.level.block.Block.box(0.0D,8.0D,0.0D,16.0D,16.0D,16.0D);
    public LineSlab(Properties settings) {

        super(settings);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, Boolean.FALSE));
    }
    @SuppressWarnings("deprecation")
    @Override
    public VoxelShape getShape(BlockState blockState, @NotNull BlockGetter blockGetter, @NotNull BlockPos blockPos, @NotNull CollisionContext collisionContext) {
        SlabType slabType = blockState.getValue(TYPE);
        switch (slabType) {
            case DOUBLE -> {
                return Shapes.block();
            }
            case TOP -> {
                return SLAB_TOP;
            }
        }
        return SLAB_BOTTOM;
    }
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        assert ctx != null;
        BlockPos blockPos = ctx.getClickedPos();
        BlockState blockState = ctx.getLevel().getBlockState(blockPos);
        if (blockState.getBlock() == this) {
            return (BlockState)((BlockState)blockState.setValue(TYPE, SlabType.DOUBLE)).setValue(WATERLOGGED, false);
        } else {
            FluidState fluidState = ctx.getLevel().getFluidState(blockPos);
            BlockState blockState2 = this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(FACING, ctx.getHorizontalDirection().getOpposite()).setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);
            Direction direction = ctx.getClickedFace();
            if (direction == Direction.DOWN || direction != Direction.UP && ctx.getClickLocation().y - (double)blockPos.getY() > 0.5) {
                return (BlockState)blockState2.setValue(TYPE, SlabType.TOP);
            }
            return blockState2;
        }
    }
    @SuppressWarnings("deprecation")
    @Override
    public boolean canBeReplaced(BlockState blockState, BlockPlaceContext blockPlaceContext) {
        ItemStack itemStack = blockPlaceContext.getItemInHand();
        SlabType slabType = blockState.getValue(TYPE);
        if (slabType == SlabType.DOUBLE || !itemStack.is(this.asItem())) {
            return false;
        }
        if (blockPlaceContext.replacingClickedOnBlock()) {
            boolean bl = blockPlaceContext.getClickLocation().y - (double)blockPlaceContext.getClickedPos().getY() > 0.5;
            Direction direction = blockPlaceContext.getClickedFace();
            if (slabType == SlabType.BOTTOM) {
                return direction == Direction.UP || bl && direction.getAxis().isHorizontal();
            }
            return direction == Direction.DOWN || !bl && direction.getAxis().isHorizontal();
        }
        return true;
    }
    @SuppressWarnings("deprecation")
    @Override
    public FluidState getFluidState(BlockState state) {
        assert state != null;
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @SuppressWarnings("deprecation")
    @Override
    public BlockState updateShape(BlockState state, @NotNull Direction facing, @NotNull BlockState neighborState, @NotNull LevelAccessor world, @NotNull BlockPos pos, @NotNull BlockPos neighborPos) {
        if (state.getValue(WATERLOGGED)) {
            world.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
        }
        return super.updateShape(state, facing, neighborState, world, pos, neighborPos);
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean isPathfindable(@NotNull BlockState world, @NotNull BlockGetter view, @NotNull BlockPos pos, @NotNull PathComputationType env) {
        if (env == PathComputationType.WATER) {
            return view.getFluidState(pos).is(FluidTags.WATER);
        }
        return false;
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<net.minecraft.world.level.block.Block, BlockState> builder) {
        assert builder != null;
        builder.add(FACING, WATERLOGGED, TYPE);
    }
}
