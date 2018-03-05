package clean.architecture.isp.exercise;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;

public class Printer implements Peripheral {

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
		throw new UnsupportedOperationException();
	}

	public void keyPressed(KeyEvent e) {
		throw new UnsupportedOperationException();
	}

	public void keyReleased(KeyEvent e) {
		throw new UnsupportedOperationException();
	}

	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
		System.out.println("Printing!");
		return 0;
	}

}
