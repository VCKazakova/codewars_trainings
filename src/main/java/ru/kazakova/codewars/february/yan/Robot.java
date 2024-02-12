package ru.kazakova.codewars.february.yan;

public class Robot implements Runnable {

    private final Object lock;
    /**
     * у робота есть класс ноги, который наследуется от Runnuble
     * и бесконечно ходит в методе run()
     * с левой тоже самое
     * нужно сделать так, чтобы ноги ходили поочередно
     */

    private String name;
    private Boolean isLeft;

    Robot(String name, Object lock, Boolean isLeft) {
        this.name = name;
        this.lock = lock;
        this.isLeft = isLeft;
    }

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Robot robot = new Robot("left", lock, true);
        Robot robot1 = new Robot("right", lock, false);


        Thread leftThread = new Thread(robot);
        leftThread.setName("left");
        Thread rightThread = new Thread(robot1);
        rightThread.setName("right");

        robot.startThreads(leftThread, rightThread);

    }

    public void startThreads(Thread thread1, Thread thread2) throws InterruptedException {
        thread1.start();
        thread1.join();
        System.out.println(thread1.getName());
        thread2.start();
        System.out.println(thread2.getName());
        thread2.join();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
