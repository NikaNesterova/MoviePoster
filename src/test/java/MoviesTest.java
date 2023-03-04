import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoviesTest {
    MoviesManager manager = new MoviesManager();

    MoviesItem item1 = new MoviesItem(1, 1, "Бладшот");
    MoviesItem item2 = new MoviesItem(2, 2, "Вперед");
    MoviesItem item3 = new MoviesItem(3, 3, "Отель Белград");
    MoviesItem item4 = new MoviesItem(4, 4, "Джентельмены");
    MoviesItem item5 = new MoviesItem(5, 5, "Человек-невидимка");
    MoviesItem item6 = new MoviesItem(6, 6, "Тролли.Мировой тур");
    MoviesItem item7 = new MoviesItem(7, 7, "Номер один");
    MoviesItem item8 = new MoviesItem(8, 8, "Малена");
    MoviesItem item9 = new MoviesItem(9, 9, "Моана");
    MoviesItem item10 = new MoviesItem(10, 10, "Один дома");


    @BeforeEach
    public void setup() {
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли.Мировой тур");
        manager.add("Номер один");
        manager.add("Малена");
        manager.add("Моана");
        manager.add("Один дома");
    }

    @Test
    public void shouldFindAll() {
        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены", "Человек-невидимка", "Тролли.Мировой тур", "Номер один", "Малена", "Моана", "Один дома"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastItems() {
        String[] expected = {"Один дома", "Моана", "Малена", "Номер один", "Тролли.Мировой тур", "Человек-невидимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLess() {
        MoviesManager manager = new MoviesManager(4);
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        String[] expected = {"Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLessLimit() {
        MoviesManager manager = new MoviesManager(5);
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        String[] expected = {"Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindAboveLimit() {
        MoviesManager manager = new MoviesManager(15);
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        String[] expected = {"Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindAboveMaxLimit() {
        MoviesManager manager = new MoviesManager(1);
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindMaxLimit() {
        MoviesManager manager = new MoviesManager(1);
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        String[] expected = {"Джентельмены"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLimit() {
        MoviesManager manager = new MoviesManager(10);
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        String[] expected = {"Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldMaxLimit() {
        MoviesManager manager = new MoviesManager(10);
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли.Мировой тур");
        manager.add("Номер один");
        manager.add("Малена");
        manager.add("Моана");
        manager.add("Один дома");

        String[] expected = {"Один дома", "Моана", "Малена", "Номер один", "Тролли.Мировой тур", "Человек-невидимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMax() {
        MoviesManager manager = new MoviesManager(10);
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли.Мировой тур");
        manager.add("Номер один");
        manager.add("Малена");
        manager.add("Моана");
        manager.add("Один дома");

        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены", "Человек-невидимка", "Тролли.Мировой тур", "Номер один", "Малена", "Моана", "Один дома"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

}