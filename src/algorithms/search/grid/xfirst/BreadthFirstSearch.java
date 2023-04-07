package algorithms.search.grid.xfirst;

import algorithms.search.grid.base.OrderedPair;
import algorithms.search.grid.base.Search2DBase;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * This class' implement method does a Breadth First Search on a 2 dimensional array.
 */
public class BreadthFirstSearch extends Search2DBase {
    /**
     * Creates Search object with data array.
     */
    protected BreadthFirstSearch() {
        super("Breadth First Search");
    }

    /**
     * Performs a Breadth First Search on a 2 dimensional array. The big difference between depth first and
     * breadth first is the data structure used to store the next nodes to visit. Breadth first uses a Queue
     * to add nodes to visit so the first added node is always the next to visit. This describes the First
     * In First Out (FIFO) nature of a Queue.
     *
     * @param grid 2 dimensional array to search through
     * @param start Ordered pair to begin the search
     * @param target value to search for
     * @return Ordered pair where value was found, or (-1, -1) if not found
     */
    @Override
    public OrderedPair implement(int[][] grid, OrderedPair start, int target) {
        Queue<OrderedPair> toVisit = new LinkedList<>();
        Set<OrderedPair> visited = new HashSet<>();
        toVisit.add(start);
        while (!toVisit.isEmpty()) {
            OrderedPair visiting = toVisit.poll();
            int currX = visiting.getX();
            int currY = visiting.getY();
            int atVisiting = grid[currX][currY];
            if (atVisiting == target) {
                return visiting;
            }
            visited.add(visiting);

            //add neighbors
            rowLoop:
            for (int rowOffset = -1; rowOffset <= 1; rowOffset++) {
                for (int colOffset = -1; colOffset <= 1; colOffset++) {
                    int neighborX = currX + rowOffset;
                    int neighborY = currY + colOffset;
                    if (neighborX < 0 || neighborX > grid.length - 1) {
                        continue rowLoop;
                    }
                    if (neighborY < 0 || neighborY > grid[neighborX].length - 1) {
                        continue;
                    }
                    OrderedPair neighbor = new OrderedPair(neighborX, neighborY);
                    if (!visited.contains(neighbor)) {
                        toVisit.add(neighbor);
                    }
                }
            }
        }
        return OrderedPair.NOT_FOUND;
    }

    public static void main(String[] args) {
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        int[][] grid = {
                {1,3,4,6,9},
                {-1,5,-7,10,4},
                {-6,-7,-8,-9,0},
                {5,5,5,5,5},
                {4,3,2,1,-1}
        };
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                OrderedPair start = new OrderedPair(i,j);
                System.out.println(start+ " -> " +
                        bfs.implement(grid, start, 5));
            }
        }
    }
}
