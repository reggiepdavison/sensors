package clean.architecture.isp.exercise;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;

public class Mouse implements Peripheral {

	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse clicked event: " + e);
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("Mouse pressed event: " + e);
	}

	public void mouseReleased(MouseEvent e) {
		System.out.println("Mouse released event: " + e);
	}

	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse entered event: " + e);
	}

	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse exited event: " + e);
	}

	public void mouseWheelMoved(MouseWheelEvent e) {
		System.out.println("Mouse wheel moved event: " + e);
	}

	public void mouseDragged(MouseEvent e) {
		System.out.println("Mouse dragged event: " + e);
	}

	public void mouseMoved(MouseEvent e) {
		System.out.println("Mouse moved event: " + e);
	}

	public void keyTyped(KeyEvent e) {
		throw new UnsupportedOperationException();
	}

	public void keyPressed(KeyEvent e) {
		throw new UnsupportedOperationException();
	}

	public void keyReleased(KeyEvent e) {
		throw new UnsupportedOperationException();
	}
	
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
		throw new UnsupportedOperationException();
	}
	
}
