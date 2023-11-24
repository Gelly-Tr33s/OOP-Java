/* 

	Swing - a framework to create GUI interface
	 ^
	 | 
	AWT - Abstract Window Toolkit (good to have, hard to code)

	Widgets - controls such as listbox(dropdowns), textbox, buttons 	etc.

	Multi-tasking vs Multi-threading
	// multi-tasking = capability of the OS to run more than one application simultaneously
	// multi-threading = capability of the application to run more than one process/thread simulataneously

 You cannot do multi-threading in C
 Minimize and smaller windows are automatic
*/

import javax.swing.JFrame; // window
import javax.swing.JLabel; // a label widget

import javax.swing.SwingUtilities; // allows us to run seperate thread

public class SwingIntro {

	SwingIntro () {
	
	JFrame frmWindow = new JFrame("Intro to Swing...");
	frmWindow.setSize(300, 200); 
    // x and y pixels (picture element - smallest unit of information inside a screen)
	frmWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// puts an exit button
	JLabel lblFirst = new JLabel("My First GUI code");
	// creates label widget 
	
	frmWindow.add(lblFirst); // add widget on frame

	frmWindow.setVisible(true); // by default, frame is invisible
	
	

	} // SwingIntro

	public static void main(String[] args) {

		// runs on a seperate thread
		SwingUtilities.invokeLater(new Runnable() {
		public void run() {
		new SwingIntro();
		} // run		
		}); //SwingUtilities.invokeLater

	} // public static void main


} // public class SwingIntro 
