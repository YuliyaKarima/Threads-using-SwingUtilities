package threads;

import model.MonitorModel;

public class RunThreads implements Runnable {
	// app's model
	private MonitorModel model;

	// Constructor sets app's model
	public RunThreads(MonitorModel a_model) {
		model = a_model;
	}

	/**
	 * In this method we use a cycle for to determine when we will be update
	 * model's data
	 */
	@Override
	public void run() {
		for (int i = 0; i <= 100000; i++) {
			// doing something here...
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName);
			if (i % 1000 == 0) {
				// updating model's data with cycle variable
				model.setC(i / 1000);
				// give another thread a chance
				try {
					Thread.sleep(55);
				} catch (Exception ex) {

				}
			}
		}
	}
}
