package algorithms.search.grid.xfirst;

import algorithms.search.grid.base.OrderedPair;
import algorithms.search.grid.base.Search2DBase;

import java.util.*;

/**
 * This class' implement method does a Depth First Search on a 2 dimensional array.
 */
public class DepthFirstSearch extends Search2DBase {
    /**
     * Creates Search object with data array.
     */
    protected DepthFirstSearch() {
        super("Depth First Search");
    }

    /**
     * Performs a Depth First Search on a 2 dimensional array. The big difference between depth first and
     * breadth first is the data structure used to store the next nodes to visit. Depth first uses a Stack
     * to add nodes to visit so the last added node is always the next to visit. This describes the Last
     * In First Out (LIFO) nature of a stack.
     *
     * @param grid 2 dimensional array to search through
     * @param start Ordered pair to begin the search
     * @param target value to search for
     * @return Ordered pair where value was found, or (-1, -1) if not found
     */
    @Override
    public OrderedPair implement(int[][] grid, OrderedPair start, int target) {
        Stack<OrderedPair> toVisit = new Stack<>();
        Set<OrderedPair> visited = new HashSet<>();
        toVisit.push(start);
        while (!toVisit.isEmpty()) {
            OrderedPair visiting = toVisit.pop();
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
                        toVisit.push(neighbor);
                    }
                }
            }
        }
        return OrderedPair.NOT_FOUND;
    }

    public static void main(String[] args) {
        DepthFirstSearch bfs = new DepthFirstSearch();
        int target = 100;
        int[][] grid = {
                {1,3,4,6,target},
                {-1,5,-7,10,4},
                {-6,-7,-8,-9,target},
                {5,5,5,5,5},
                {5,3,2,1,8}
        };
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                OrderedPair start = new OrderedPair(i,j);
                System.out.println(start+ " -> " +
                        bfs.implement(grid, start, 100));
            }
        }
    }
}
