package algorithms.search.grid.xfirst;

import algorithms.search.grid.base.OrderedPair;
import algorithms.search.grid.base.Search2DBase;

public class BreadthFirstSearch extends Search2DBase {
    /**
     * Creates Search object with data array.
     */
    protected BreadthFirstSearch() {
        super("Breadth First Search");
    }

    @Override
    public OrderedPair implement(int[][] data, int target) {
        return new OrderedPair(-1, -1);
    }
}
