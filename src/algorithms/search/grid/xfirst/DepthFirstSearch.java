package algorithms.search.grid.xfirst;

import algorithms.search.grid.base.OrderedPair;
import algorithms.search.grid.base.Search2DBase;

public class DepthFirstSearch extends Search2DBase {
    /**
     * Creates Search object with data array.
     */
    protected DepthFirstSearch() {
        super("Depth First Search");
    }

    @Override
    public OrderedPair implement(int[][] grid, int target) {
        return new OrderedPair(-1, -1);
    }
}
