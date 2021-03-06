import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AccueilMenu extends JFrame
{
    private static final long serialVersionUID = 1L;
    private Control app;
    
    public AccueilMenu(Control app)
    {
        super("Taquin");

        this.app = app;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = (JPanel)getContentPane();

        AccueilButton newGame8 = new AccueilButton(0, 0, 0, 200, 64, this, "<HTML>New <U>8</U>-Puzzle</HTML>");
        panel.add(newGame8);
        
        AccueilButton newGame15 = new AccueilButton(1, 0, 65, 200, 64, this, "<HTML>New <U>1</U>5-Puzzle</HTML>");
        panel.add(newGame15);
        
        AccueilButton options = new AccueilButton(5, 0, 130, 200, 64, this, "<HTML><U>O</U>ptions</HTML>");
        panel.add(options);

        JLabel labelx = new JLabel();
        panel.add(labelx);
        
        setLocation(500, this.getY());
        setSize(200, 195);
        setResizable(false);
        
        addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent ke) {
                //doSomething(); - this may create confusion.
            }
            @Override
            public void keyReleased(KeyEvent ke) {
                //doSomething(); - this may create confusion.
            }
            @Override
            public void keyTyped(KeyEvent ke) {
                char key = ke.getKeyChar();
                if (key == '8')
                {
                    create8Puzzle();
                }
                if (key == '1')
                {
                    create15Puzzle();
                }
                if (key == 'o' | key == 'O')
                {
                    openOptionMenu();
                }
            }
        });
        
        setVisible(true);
    }

    public void openOptionMenu()
    {
        app.openOptionMenu();
    }
    
    public void create8Puzzle()
    {
        app.create8Puzzle();
    }
    
    public void create15Puzzle()
    {
        app.create15Puzzle();
    }
}
