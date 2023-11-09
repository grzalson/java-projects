package repo;

import repo.Block;

import java.util.List;

public interface CompositeBlock extends Block {
    List<Block> getBlocks();


}
