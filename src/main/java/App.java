import org.apache.commons.lang3.StringUtils;

public class App {

    public static void main(String[] args) {

        if (args.length != 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(StringUtils.upperCase(args[i]));
            }
        } else {
            throw new RuntimeException("Пустая строка");
        }

    }
}
