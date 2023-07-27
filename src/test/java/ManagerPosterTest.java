import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerPosterTest {

    private static ManagerPoster noneConstruct = new ManagerPoster();

    private static ManagerPoster argConstruct = new ManagerPoster(7);

    @Test
    void noneConstructorTestMethod() {
        String[] expected = new String[]{"6", "5", "4", "3", "2"};
        noneConstruct.add("1");
        noneConstruct.add("2");
        noneConstruct.add("3");
        noneConstruct.add("4");
        noneConstruct.add("5");
        noneConstruct.add("6");

        Assertions.assertArrayEquals(expected, noneConstruct.findLast());


        expected = new String[]{"1", "2", "3", "4", "5", "6"};

        Assertions.assertArrayEquals(expected, noneConstruct.findAll());

    }

    @Test
    void argConstructorTestMethod() {
        String[] expected = new String[]{"6", "5", "4", "3", "2", "1"};
        argConstruct.add("1");
        argConstruct.add("2");
        argConstruct.add("3");
        argConstruct.add("4");
        argConstruct.add("5");
        argConstruct.add("6");

        Assertions.assertArrayEquals(expected, argConstruct.findLast());

        expected = new String[]{"1", "2", "3", "4", "5", "6"};

        Assertions.assertArrayEquals(expected, argConstruct.findAll());

        argConstruct.add("7");
        argConstruct.add("8");
        argConstruct.add("9");

        expected = new String[]{"9", "8", "7", "6", "5", "4", "3"};
        Assertions.assertArrayEquals(expected, argConstruct.findLast());
    }
}
