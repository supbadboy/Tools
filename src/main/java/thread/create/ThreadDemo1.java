package thread.create;


/**
 * �̴߳�����ʽ  
 * 	1. �̳�Thread�࣬��дrun����         ͨ����־���Կ��������̵߳�˳���������
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
