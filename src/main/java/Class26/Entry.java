package Class26;

public class Entry {
    private String key;
    private Double value;

    public Entry(String key, Double price) {
        this.key = key;
        this.value = price;
    }

    public String getKey() {
        return key;
    }

    public Double getPrice() {
        return value;
    }
}
