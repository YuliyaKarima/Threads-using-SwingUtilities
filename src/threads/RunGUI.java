package threads;

import javax.swing.JSlider;

import model.MonitorModel;
import view.GUI;

//thread that creates and run view 
public class RunGUI implements Runnable {
	MonitorModel model;
	GUI gui;

	public RunGUI(MonitorModel a_model) {
		gui = new GUI(a_model);
		model = a_model;
		gui.buildGUI();
	}

	@Override
	/**
	 * In this method we call update method of the view and pass to it model's
	 * We check if model's data reached values 100 and then stop executing run method
	 * data
	 */
	public void run() {
		// TODO Auto-generated method stub
		boolean stop = false;
		do {
			if ((model.getC() == 100) && (model.getD() == 100))
				stop = true;
			System.out.println("view's updating " + model.getC() + " " + model.getD());
			gui.update(model.getC(), model.getD());
			//give another thread a chance
			try {
				Thread.sleep(60);
			} catch (Exception ex) {

			}
		} while (!stop);	
	}
}
