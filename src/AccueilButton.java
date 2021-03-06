import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import javax.swing.*;

public class AccueilButton extends JLabel implements MouseListener
{
    private static final long serialVersionUID = 1L;
    int id;
    AccueilMenu aMenu;
    
    public AccueilButton(int id, int x, int y, int w, int h, AccueilMenu aMenu, String text)
    {
        super(text, null, JLabel.CENTER);
        this.id = id;
        this.aMenu = aMenu;
        setBounds(x, y, w, h);
        addMouseListener(this);
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public void mouseClicked(MouseEvent e)
    {
        switch(id)
        {
            case 0:
            {
                aMenu.create8Puzzle();
                break;
            }
            case 1:
            {
                aMenu.create15Puzzle();
                break;
            }
            case 5:
            {
                aMenu.openOptionMenu();
                break;
            }
        }
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
