package com.monsterlin.time;


import com.monsterlin.grab.GrabData;

import java.util.TimerTask;


public class GrabDataTimerTask extends TimerTask {



	@Override
	public void run() {
		//在这里去写执行的任务
		
		try {
			GrabData.grabDataFromQSBK();
			System.out.println("任务执行完毕");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("任务执行失败");
		}

		
	}

}
