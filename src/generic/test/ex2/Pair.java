package generic.test.ex2;

public class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    public void setFirst(T1 firstValue) {
        this.first = firstValue;
    }

    public void setSecond(T2 secondValue) {
        this.second = secondValue;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstValue=" + first +
                ", secondValue=" + second +
                '}';
    }
}
