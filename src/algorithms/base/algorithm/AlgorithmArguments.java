package algorithms.base.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class AlgorithmArguments {
    private final List<Object> arguments;
    private final boolean clock;

    public AlgorithmArguments(List<Object> arguments, boolean clock) {
        this.arguments = new ArrayList<>(arguments);
        this.clock = clock;
    }

    public List<Object> getArguments() {
        return new ArrayList<>(arguments);
    }

    public boolean clock() {
        return clock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlgorithmArguments arguments1 = (AlgorithmArguments) o;
        return clock == arguments1.clock && Objects.equals(getArguments(), arguments1.getArguments());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getArguments(), clock);
    }

    @Override
    public String toString() {
        return "AlgorithmArguments{" +
                "arguments=" + arguments +
                ", clock=" + clock +
                '}';
    }
}
