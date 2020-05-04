package com.java21days;

public class PrimeThreads2 {
    public static void main(String[] arguments) {
        try {
            //下面这一段代码是在初始化finder数组对象，值从控制台中录入
            PrimeFinder2[] finder = new PrimeFinder2[arguments.length];
            for (int i = 0; i < arguments.length; i++) {
                long count = Long.parseLong(arguments[i]);
                finder[i] = new PrimeFinder2(count);
                System.out.println("Looking for prime " + count);
            }
            boolean complete = false;
            /**
             * 下面这个循环用来保证finder这个数组中的所有对象都已经完成要做的事
             * 完成要做的事之后，会将finder中的finished变量设置为true，没调用一次构造函数就会开启一个线程，然后无规律的交叉执行
             * 下面这个循环的意思就是有数组中的对象有一个没有完成，就将complete重置为false继续等待，直到所有的线程都结束
             * 从而保证每个线程结束之后，主线程才接着往下进行。
             */
            while (!complete) {
                complete = true;
                for (int j = 0; j < finder.length; j++) {
                    if (!finder[j].finished)
                        complete = false;
                }    
                try { 
                    //每判断一次等待一秒的时间休眠，这个时间给数组中的每一个对象做他们自己的事
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    // do nothing
                }
            }
            //打印出结果，即第target个质数是多少
            for (int j = 0; j < finder.length; j++) {
                System.out.println("Prime " + finder[j].target
                    + " is " + finder[j].prime);
            }    
        } catch (NumberFormatException nfe) {
                System.out.println("Error: " + nfe.getMessage());
        } 
        //添加下面这个catch语句，用来处理NegativeNumberException的自定义异常类
        catch (NegativeNumberException nne) {
                System.out.println("Error: " + nne.getMessage());
        }
    }
}
