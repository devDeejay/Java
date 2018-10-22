package Java;

public class Result {

    Result(){}

    Result(String name, int id) {
        this.name = name;
        this.id = id;
    }

    String name;
    int id;

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Result))
            return false;

        Result object = (Result) o;
        return (this.id == ((Result) o).id);
    }
}
