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

class MListener implements WindowListener
{
  //Doesno't want to impliment all the methods below ,please see the code GUI4.java
  public void windowDeactivated(WindowEvent obj){}
  public void windowActivated(WindowEvent obj){}
  public void windowDeiconified(WindowEvent obj){}
  public void windowIconified(WindowEvent obj){}
  public void windowClosed(WindowEvent obj){}
  public void windowClosing(WindowEvent obj)
  {
    System.out.println("In closing exit programe");
    System.exit(0);
  }
  public void windowOpened(WindowEvent obj){}
}


