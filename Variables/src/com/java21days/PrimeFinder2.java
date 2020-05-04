package com.java21days;

public class PrimeFinder2  implements Runnable{
    //第几个质数
	public long target;
	//找到的第target个质数
    public long prime;
    //是否已经找到该质数
    public boolean finished = false;
    //一个线程的变量
    private Thread runner;

    //构造函数抛出NegativeNumberException
    PrimeFinder2(long inTarget) throws NegativeNumberException {
        if (inTarget < 0) {
            //如果那个值小于0，就抛出这个自定义的异常
            NegativeNumberException nne = new NegativeNumberException(
                "Negative numbers not allowed: " + inTarget);
            throw nne;
        }
        target = inTarget;
        if (runner == null) {
            //新建线程
            runner = new Thread(this);
            //启动线程
            runner.start();
        }
    }
 
    //实现Runnable接口中的run方法，线程启动将会自动调用这个方法
    public void run() {
        //用于计数
        long numPrimes = 0;
        //最小的质数
        long candidate = 2;
        //循环找到第n个质数
        while (numPrimes < target) {
            //如果是质数，计数的变量就加一
            if (isPrime(candidate)) {
                numPrimes++;
                prime = candidate;
            }
            candidate++;
        }
        //找到之后，将finish设置为true，以表示这个线程已经结束
        finished = true;
    }

    //用于判断是不是质数的函数，质数——只能被1和其本身整除的数
    boolean isPrime(long checkNumber) {
        //对数值开平方根，优化这个查找算法，原本应该是i <= checkNumber，为什么能这样做，参考下述链接：https://zhidao.baidu.com/question/50140553.html
        double root = Math.sqrt(checkNumber); 
        for (int i = 2; i <= root; i++) {
            //能被整除，就返回false，表明不是质数
            if (checkNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}

@SuppressWarnings("serial")
//内部类——在一个类的内部能再定义一个类，自定义一个NegativeNumberException的异常了类
class NegativeNumberException extends Exception {
    //无参数的构造函数
    NegativeNumberException() {
        //调用超类的构造函数
        super();
    }
    //有参数构造函数
    NegativeNumberException(String message) {
        //调用超类的构造函数
        super(message);
    }
}
