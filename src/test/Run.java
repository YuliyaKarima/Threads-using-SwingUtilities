package test;

import javax.swing.SwingUtilities;

import model.MonitorModel;
import threads.MonitorThread;
import threads.RunGUI;
import threads.RunThreads;

/**
 * Main-class In this class we initialize app's model, object of threads and
 * view
 * 
 * @author Yuliya
 *
 */
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// app's model
		MonitorModel model = new MonitorModel();
		// view
		Runnable runGUI = new RunGUI(model);
		// we use static method invokeLater to run view asynchronously on the
		// AWT event dispatching thread
		SwingUtilities.invokeLater(runGUI);
		// creating Runnable instances (they do run() method)
		RunThreads runner = new RunThreads(model);
		Runnable runner2 = new MonitorThread(model);
		// creating thread objects
		Thread alpha = new Thread(runner);
		Thread beta = new Thread(runner2);
		// setting names to threads
		alpha.setName("поток альфа");
		beta.setName("поток бета");
		// starting threads
		alpha.start();
		beta.start();
		
	}

}
