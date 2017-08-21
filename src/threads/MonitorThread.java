package threads;

import model.MonitorModel;

public class MonitorThread implements Runnable {
	// app's model
	private MonitorModel model;

	// Constructor sets app's model
	public MonitorThread(MonitorModel a_model) {
		model = a_model;
	}

	/**
	 * In this method we use a cycle for to determine when we will be update
	 * model's data
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 100; i++) {
			// doing something here...
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName);
			// updating model's data with cycle variable
			model.setD(i);
			// give another thread a chance
			try {
				Thread.sleep(55);
			} catch (Exception ex) {

			}
		}
	}
}
