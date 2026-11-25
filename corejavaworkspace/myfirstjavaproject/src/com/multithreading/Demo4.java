package com.multithreading;

class AudioThread extends Thread {
	@Override
	public void run() {
		Thread.currentThread().setName("Audio");
		Thread.currentThread().setPriority(MIN_PRIORITY);
		System.out.println("Audio: " + Thread.currentThread().getName());
		System.out.println("Audio: " + Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("audio: " + i);
		}
	}
}

class VideoThread extends Thread{
	@Override
	public void run() {
		Thread.currentThread().setName("video");
		Thread.currentThread().setPriority(NORM_PRIORITY);
		System.out.println("Video: " + Thread.currentThread().getName());
		System.out.println("Video: " + Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("video: " + i);
		}
	}
}

class MediaThread extends Thread{
	@Override
	public void run() {
		Thread.currentThread().setName("Media");
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("Media: " + Thread.currentThread().getName());
		System.out.println("Media: " + Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("media: " + i);
		}
	}
}

public class Demo4 {
	public static void main(String[] args) {


		AudioThread at = new AudioThread();
		at.setDaemon(true);
		System.out.println(at.isDaemon());
		VideoThread vt = new VideoThread();
//		MediaThread mt = new MediaThread();
		
		at.start();
		vt.start();
//		mt.start();
		
	}

}
