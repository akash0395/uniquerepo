
public class NestedTest {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("NestedTest.this.x = " + NestedTest.this.x);
        }
    }

    public static void main(String... args) {
        NestedTest st = new NestedTest();
  
        NestedTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}
