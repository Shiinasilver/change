package ThreadPool;


import javax.xml.crypto.Data;
import java.util.Date;

public class ThreadTest {
    public static void main(String[] args) {

        //创建线程的方法
        //1.继承Thread类 重写run方法
        new EatThread().start();
        new SleepThread().start();
        //2.实现Runnable接口 重写run（）方法
        Thread2 thread2 = new Thread2();

        Thread t1 = new Thread(thread2);
        Thread t2 = new Thread(thread2);

        t1.start();
        t2.start();

    }
}

class EatThread extends Thread{
        public void run(){
            System.out.println("吃饭 \t"+new Date());
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("结束  \t"+new Date());
        }
}
class SleepThread extends Thread{
    public void run(){
        System.out.println("睡觉 \t" +new Date());
    try {
        Thread.sleep(5000);
    }catch (InterruptedException e){
        e.printStackTrace();
    }
        System.out.println("星了 \t" +new Date());
    }
}
class Thread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("线程名"+Thread.currentThread().getName());
    }
}
