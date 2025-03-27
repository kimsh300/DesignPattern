public class Test {
    private Test() {
    }

    private static Test test = null;

    public synchronized static Test getInstance() {
        if (test == null) {
            test = new Test();
        }
        return test;
    }
}
