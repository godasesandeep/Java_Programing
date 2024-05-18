import java.awt.*;
import java.awt.event.*;

class GUI3
{
    public static void main(String a[])
    {
      MFrame mobj =new MFrame("PPA50");
    }
}

class MFrame
{
    public MFrame(String title)
    {
        Frame fobj = new Frame(title);
        fobj.setSize(600,600);
        fobj.setVisible(true);
        fobj.addWindowListener(new MListener());
    }
}

class MListener extends WindowAdapter
{

  public void windowClosing(WindowEvent obj)
  {
    System.out.println("Ala re");
    System.exit(0);
  }
}


