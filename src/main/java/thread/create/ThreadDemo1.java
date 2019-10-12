package thread.create;


/**
 * 线程创建方式  
 * 	1. 继承Thread类，重写run方法         通过日志可以看出创建线程的顺序是随机的
 * @author Administrator
 *
 */
public class ThreadDemo1 extends Thread{

	@Override
	public void run() {
		System.out.println(getName() +  "is  running");
	}

	public static void main (String args []) {
		new ThreadDemo1().start();
		new ThreadDemo1().start();
		new ThreadDemo1().start();
		new ThreadDemo1().start();
	}
	
	
	
}
