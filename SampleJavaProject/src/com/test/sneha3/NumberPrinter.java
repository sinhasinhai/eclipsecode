package com.test.sneha3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* 
 * 1> Write a producer consumer program using 2 threads where odd and even numbers 
 * are printed by these 2 threads alternatively without using synchronization.
 */
public class NumberPrinter implements Runnable {
	private Lock lock;
	private Condition condition;
	private String type;
	private static boolean oddTurn = true;

	public NumberPrinter(String type, Lock lock, Condition condition) {
//To check the present class
		this.type = type;
		this.lock = lock;
		this.condition = condition;
	}
//check the condition for even and odd 
	public void run() {
		int i = type.equals("odd") ? 1 : 2;
		while (i <= 10) {
			if (type.equals("odd"))
				printOdd(i);
			if (type.equals("even"))
				printEven(i);
			i = i + 2;
		}
	}

	private void printOdd(int i) {
// synchronized (lock) {
		lock.lock();
		while (!oddTurn) {
			try {
// lock.wait();
				condition.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(type + " " + i);
		oddTurn = false;
// lock.notifyAll();
		condition.signalAll();
		lock.unlock();
	}

// }
	private void printEven(int i) {
// synchronized (lock) {
		lock.lock();
		while (oddTurn) {
			try {
// lock.wait();
				condition.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(type + " " + i);
		oddTurn = true;
// lock.notifyAll();
		condition.signalAll();
		lock.unlock();
	}

// }
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		Condition condition = lock.newCondition();
		Thread odd = new Thread(new NumberPrinter("odd", lock, condition));
		Thread even = new Thread(new NumberPrinter("even", lock, condition));
		odd.start();
		even.start();
	}
}
