import java.awt.*;

class GUI2
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
    }
}



