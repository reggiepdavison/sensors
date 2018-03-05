package clean.architecture.isp.exercise;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;

public class Keyboard implements Peripheral {

	public void mouseClicked(MouseEvent e) {
		throw new UnsupportedOperationException();
	}

	public void mousePressed(MouseEvent e) {
		throw new UnsupportedOperationException();
	}

	public void mouseReleased(MouseEvent e) {
		throw new UnsupportedOperationException();
	}

	public void mouseEntered(MouseEvent e) {
		throw new UnsupportedOperationException();
	}

	public void mouseExited(MouseEvent e) {
		throw new UnsupportedOperationException();
	}

	public void mouseWheelMoved(MouseWheelEvent e) {
		throw new UnsupportedOperationException();
	}

	public void mouseDragged(MouseEvent e) {
		throw new UnsupportedOperationException();
	}

	public void mouseMoved(MouseEvent e) {
		throw new UnsupportedOperationException();
	}

	public void keyTyped(KeyEvent e) {
		System.out.println("Key typed event: " + e);
	}

	public void keyPressed(KeyEvent e) {
		System.out.println("Key pressed event: " + e);
	}

	public void keyReleased(KeyEvent e) {
		System.out.println("Key released event: " + e);
	}

	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
		throw new UnsupportedOperationException();
	}
}
