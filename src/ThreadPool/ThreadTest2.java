package ThreadPool;

public class ThreadTest2 {
    public static void main(String[] args){
        new MyThread().start();
    }
}
class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+"\t"+Thread.currentThread().getId());
    }
}
