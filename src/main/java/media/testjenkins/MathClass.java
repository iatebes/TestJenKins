package media.testjenkins;

public class MathClass {

    public int plus(int a, int b) throws Exception {
        if (a < 0 || b < 0) {
            throw new Exception("Số truyền vào phải dương");
        }
        return a + b;
    }
}
