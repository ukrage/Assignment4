import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Streamの練習
        stream();

        // デバッグの練習
        debug();
    }

    /*
        Streamの練習
     */
    private static void stream() {
        List<Integer> integerList = Arrays.asList(60, 4, 7, 1, 20, 9, 2, 3, 16);
        integerList.stream() // streamの取得
                .sorted() // 中間操作
                .map(integer -> "この要素は" + integer + "です。") // 中間操作
                .forEach(System.out::println); // 終端操作
    }

    /*
       デバッグの練習
    */
    private static void debug() {
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            if (sum > 30) {
                System.out.println("sumが30を超えたため処理を中断します。");
                break;
            }
            if (i % 2 == 0) {
                printStar(i);
                sum += i;
            }
        }
    }

    private static void printStar(final int num) {
        System.out.println("*".repeat(num));
    }
}
