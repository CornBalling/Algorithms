package algorithms.base.algorithm;

import java.util.Objects;

public final class AlgorithmResult {
    private final String result;
    private final long timeElapsed;

    public AlgorithmResult(String result) {
        this.result = result;
        this.timeElapsed = -1L;
    }

    public AlgorithmResult(String result, long timeElapsed) {
        this.result = result;
        this.timeElapsed = timeElapsed;
    }

    public String getResult() {
        return result;
    }

    public long getTimeElapsed() {
        return timeElapsed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlgorithmResult that = (AlgorithmResult) o;
        return getTimeElapsed() == that.getTimeElapsed() && Objects.equals(getResult(), that.getResult());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getResult(), getTimeElapsed());
    }

    @Override
    public String toString() {
        long time = getTimeElapsed();
        return getResult() + ((time >= 0) ? ": " + time + " nanoseconds elapsed" : "");
    }
}
