package Week_2.OOPS.live;

import Week_2.OOPS.music.Playable;
import Week_2.OOPS.music.string.Veena;
import Week_2.OOPS.music.wind.Saxophone;

public class Test {

    public static void main(String[] args) {

        Veena v = new Veena();
        v.play();

        Saxophone s = new Saxophone();
        s.play();

        Playable p;

        p = new Veena();
        p.play();

        p = new Saxophone();
        p.play();
    }
}


// output 
// PS C:\Coding\Summer_Assignment_2401920130067> java Week_2.OOPS.live.Test     
// Sound of Veena
// Sound of Saxophone
// Sound of Veena
// Sound of Saxophone