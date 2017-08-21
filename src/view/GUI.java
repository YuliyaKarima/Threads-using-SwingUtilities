package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

import model.MonitorModel;

/**
 * app's view
 * 
 * @author Yuliya
 *
 */
public class GUI extends JFrame {
	// two components JSlider that will be presenting model's current state
	private JSlider slider;
	private JSlider slider2;
	// view's model
	private MonitorModel model;

	/**
	 * Constructor sets view's model and view's name
	 * 
	 * @param a_model
	 *            view's model
	 */
	public GUI(MonitorModel a_model) {
		this.setTitle("Monitor");
		model = a_model;
	}

	/**
	 * Method initializes view's components, sets size and parameter of
	 * Visibility
	 */
	public void buildGUI() {

		slider = new JSlider(model.getC());
		slider.setOrientation(JSlider.HORIZONTAL);
		slider2 = new JSlider(model.getD());
		slider2.setOrientation(JSlider.HORIZONTAL);
		getContentPane().add(BorderLayout.NORTH, slider);
		getContentPane().add(BorderLayout.SOUTH, slider2);
		add(slider);
		setSize(1000, 500);
		setVisible(true);
	}

	/**
	 * Method sets new values for JSlider components and call update method to
	 * repaint view
	 * 
	 * @param c
	 *            value of the first JSlider
	 * @param d
	 *            value of the second JSlider
	 */
	public void update(int c, int d) {
		slider.setValue(c);
		slider2.setValue(d);
		update(getGraphics());

	}

}
