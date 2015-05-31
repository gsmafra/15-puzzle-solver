import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class OptionButton extends JLabel implements MouseListener
{
	private static final long serialVersionUID = 1L;
	OptionMenu menu;
	
	public OptionButton(int id, int x, int y, int w, int h, OptionMenu menu)
	{
        super();
        this.menu = menu;
        setBounds(x, y, w, h);
        addMouseListener(this);
    }

	public void mouseClicked(MouseEvent e)
	{
		menu.close();
	}

	public void mouseEntered(MouseEvent e)
	{
	}

	public void mouseExited(MouseEvent e)
	{
	}

	public void mousePressed(MouseEvent e)
	{
	}

	public void mouseReleased(MouseEvent e)
	{
	}
}