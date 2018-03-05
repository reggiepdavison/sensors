package clean.architecture.isp.exercise;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;

public interface Peripheral {
    public void mouseClicked(MouseEvent e);
    public void mousePressed(MouseEvent e);
    public void mouseReleased(MouseEvent e);
    public void mouseEntered(MouseEvent e);
    public void mouseExited(MouseEvent e);
    public void mouseWheelMoved(MouseWheelEvent e);
    public void mouseDragged(MouseEvent e);
    public void mouseMoved(MouseEvent e);
    public void keyTyped(KeyEvent e);
    public void keyPressed(KeyEvent e);
    public void keyReleased(KeyEvent e);
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException;
}
