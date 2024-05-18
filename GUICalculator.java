
import java.awt.*;
import java.awt.event.*;

class GUICalculator
{
    public static void main(String arg[])
    {
        Calculator cobj = new Calculator(400,400,"Marvellous Calculator");
        Calculator aobj = new Calculator(400,400,"Ashwini");
    }
}

class Calculator extends WindowAdapter implements ActionListener
{
    public Frame mainframe;
    public Button b1,b2,b3,b4;
    public TextField t1,t2;
    public Label lobj;
    Float no1,no2;

    public Calculator(int width, int height, String title)
    {
        mainframe = new Frame(title);
        mainframe.setSize(width,height);
        mainframe.addWindowListener(this); //Method from WindowAdaptor for listening actions on frame

        b1 = new Button("Add");
        b2 = new Button("Sub");
        b3 = new Button("Mul");
        b4 = new Button("Div");

        //x,y,w,h
        b1.setBounds(10,280,80,40);
        b2.setBounds(100,280,80,40);
        b3.setBounds(190,280,80,40);
        b4.setBounds(290,280,80,40);

        t1 = new TextField(); //Text field is for input number from user
        t2 = new TextField();

        t1.setBounds(70,100,100,40);
        t2.setBounds(220,100,100,40); 

        //add the Button and TextField in mainframe

        mainframe.add(b1); 
        mainframe.add(b2);
        mainframe.add(b3);
        mainframe.add(b4);

        mainframe.add(t1);
        mainframe.add(t2);

        lobj =new Label();
        lobj.setBounds(150,125,200,100);

        mainframe.add(lobj);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        mainframe.setLayout(null);
        mainframe.setVisible(true);

    } //end of constructor

    public void windowClosing(WindowEvent obj)
    {
        System.out.println("Hi I am litening for closing");
        System.exit(0);
    }

    public void actionPerformed(ActionEvent aobj)
    {
        try
        {
            no1 =Float.parseFloat(t1.getText());
            no2 =Float.parseFloat(t2.getText());

            if(aobj.getSource()==b1)
            {
                lobj.setText("Addition is : "+(no1+no2));
            }
            else if(aobj.getSource()==b2)
            {
                lobj.setText("Substraction is : "+(no1-no2));
            }
            if(aobj.getSource()==b3)
            {
                lobj.setText("Multification is : "+(no1*no2));
            }
            if(aobj.getSource()==b4)
            {
                lobj.setText("Division is : "+(no1/no2));
            }
        }
        catch(Exception obj){}
    }
} //End of calculator class

