package algorithms.search.grid.base;

import java.util.Objects;

/**
 * This represents an ordered pair in a 2 dimensional array.
 * It is assumed coordinates in arrays will always be positive so {@code NOT_FOUND} is the point (-1, -1).
 */
public final class OrderedPair {
    public static final OrderedPair NOT_FOUND = new OrderedPair(-1, -1);
    private final int x;
    private final int y;

    /**
     * Constructs an Ordered Pair.
     *
     * @param x value of x coordinate
     * @param y value of y coordinate
     */
    public OrderedPair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderedPair that = (OrderedPair) o;
        return getX() == that.getX() && getY() == that.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }
}
