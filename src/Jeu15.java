public class Jeu15 extends Jeu
{

    public Jeu15(Control app, int id)
    {
        super(4, 4, app, id);
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
            int ind = 5+i*13/10;
            x = tiles[ind].getPosX() - 1;
            y = tiles[ind].getPosY() - 1;
            state[3*y + x] = i;
        }
        
        return state;
    }

    public int[] getState15()
    {
        int[] state = new int[16];
        int x, y;

        for(int i=0; i<16; i++)
        {
            state[i] = 0;
        }
        
        for(int i=1; i<16; i++)
        {
            x = tiles[i].getPosX();
            y = tiles[i].getPosY();
            state[4*y + x] = i;
        }
        
        return state;
    }
    
    public boolean checkIf3x3()
    {
        if(tiles[1].getPosX() != 0 || tiles[1].getPosY() != 0)
            return false;
        if(tiles[2].getPosX() != 1 || tiles[2].getPosY() != 0)
            return false;
        if(tiles[3].getPosX() != 2 || tiles[3].getPosY() != 0)
            return false;
        if(tiles[4].getPosX() != 3 || tiles[4].getPosY() != 0)
            return false;
        if(tiles[5].getPosX() != 0 || tiles[5].getPosY() != 1)
            return false;
        if(tiles[9].getPosX() != 0 || tiles[9].getPosY() != 2)
            return false;
        if(tiles[13].getPosX() != 0 || tiles[13].getPosY() != 3)
            return false;
        
        return true;
    }
}
