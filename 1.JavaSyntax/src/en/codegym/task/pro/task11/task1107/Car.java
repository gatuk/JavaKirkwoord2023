package en.codegym.task.pro.task11.task1107;

public class Car {
    private Engine engine;

    public class Engine {
        private boolean isRunning;
        public void start() {
            isRunning = true;
        }
        public void stop() {
            isRunning = false;
        }
    }

}
