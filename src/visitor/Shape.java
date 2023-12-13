package visitor;

import java.nio.charset.Charset;
import java.util.Random;

public class Shape {
    String ID;

    public Shape() {
        byte[] array = new byte[10];
        new Random().nextBytes(array);
        ID = new String(array, Charset.forName("UTF-8"));
    }
}
