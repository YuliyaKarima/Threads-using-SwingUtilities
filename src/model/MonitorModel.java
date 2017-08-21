package model;

/**
 * Model of the application that will be changed during threads execution
 * 
 * @author Yuliya
 *
 */
public class MonitorModel {
	// model's data
	private int c;
	private int d;

	// Constructor sets initial values to model's data
	public MonitorModel() {
		c = 0;
		d = 0;
	}

	// Sets model's data
	public void setC(int a_c) {
		c = a_c;
	}

	// Sets model's data
	public void setD(int a_d) {
		d = a_d;
	}

	// Retrieves model's data
	public int getC() {
		return c;
	}

	// Retrieves model's data
	public int getD() {
		return d;
	}
}
