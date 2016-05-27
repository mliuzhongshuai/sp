package org.platform.common;

/**
 * Created by liuzhongshuai on 16/4/13.
 */
public class PrintABC {

    public static Boolean isThreadA = true;
    public static Boolean isThreadB = false;
    public static Boolean isThreadC = false;

    public static void main(String[] args) {
        final PrintABC abc = new PrintABC();
        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    synchronized (abc) {
                        while(!isThreadA) {
                            try {
                                abc.wait();
                                System.out.println("1");
                            } catch (InterruptedException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                        }
                        System.out.print("A");
                        isThreadA = false;
                        isThreadB = true;
                        isThreadC = false;
                        abc.notify();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    synchronized (abc) {
                        while(!isThreadB) {
                            try {
                                abc.wait();
                                System.out.println("2");
                            } catch (InterruptedException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                        }
                        System.out.print("B");
                        isThreadA = false;
                        isThreadB = false;
                        isThreadC = true;
                        abc.notify();
                    }
                }
            }
        }).start();

        /*new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    synchronized (abc) {
                        while(!isThreadC) {
                            try {
                                abc.wait();
                                System.out.println("3");
                            } catch (InterruptedException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                        }
                        System.out.print("C");
                        isThreadA = true;
                        isThreadB = false;
                        isThreadC = false;
                        abc.notify();
                    }
                }
            }
        }).start();*/
    }
}