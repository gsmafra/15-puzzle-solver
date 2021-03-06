public class Jeu8 extends Jeu
{

    public Jeu8(Control app, int id)
    {
        super(3, 3, app, id);
    }

    public int[] getState()
    {
        int[] state = new int[9];
        int x, y;
        
        for(int i=0; i<9; i++)
        {
            state[i] = 0;
        }
        
        for(int i=1; i<9; i++)
        {
            x = tiles[i].getPosX();
            y = tiles[i].getPosY();
            state[3*y + x] = i;
        }
        
        return state;
    }
}
