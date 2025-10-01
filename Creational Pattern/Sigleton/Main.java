public class Main {
    public static void main(String args[]) {
        // private로 접근 불가
        // Test test = new Test ();

        Test test = Test.getInstance();
        Test test2 = Test.getInstance();

        if (test == test2) {
            System.out.println("Same");
        } else {
            System.out.println("Dif");
        }
    }
}