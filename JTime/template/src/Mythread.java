public class Mythread implements Runnable {
    public void run() {
        System.out.println("线程在运行！");
    }

    public static void main(String[] args) {
        Mythread myTask = new Mythread();
        Thread t = new Thread(myTask);  // 把任务交给线程去跑
        t.start();                      // 启动线程，会自动调用 run()
    }
}