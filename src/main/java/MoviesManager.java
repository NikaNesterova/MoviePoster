public class MoviesManager {

    private String[] items = new String[0];
    private int limit;

    public MoviesManager(int limit) {
        this.limit = limit;
    }

    public MoviesManager() {
        this.limit = 10;
    }

    public String[] findAll() {
        return items;
    }

    public String[] findLast() {
        int resultLenght;
        if (limit > items.length) {
            resultLenght = items.length;
        } else {
            resultLenght = limit;
        }
        String[] tmp = new String[resultLenght];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = items[items.length - 1 - i];
        }
        return tmp;
    }

    public void add(String item) {
        String[] tmp = new String[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }
}