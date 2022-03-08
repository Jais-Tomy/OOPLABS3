import java.awt.*;
import java.awt.event.*;
class Exp8_2 extends Frame implements ItemListener
{
	String clr="";
	Exp8_2()
	{
		Checkbox c1,c2,c3;
		CheckboxGroup cbg=new CheckboxGroup();
		c1=new Checkbox("RED",true,cbg);
		c2=new Checkbox("YELLOW",true,cbg);
		c3=new Checkbox("GREEN",true,cbg);
		setSize(500,500);
		setTitle("Traffic Signal");
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(c1); 
		add(c2); 
		add(c3);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	public static void main(String[] args)
	{
		new Exp8_2();
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		clr=(e.getItem()).toString();
		repaint();
	}
	
	public void paint(Graphics g) {
		g.drawString("Traffic signals",200,250);
		g.drawRoundRect(200,80,100,250,50,30);
		g.setColor(Color.black);
		g.fillRoundRect(200,80,100,250,50,30);
		if(clr.equals("RED")) 
		{
			g.setColor(Color.red);
			g.fillOval(225,125,50,50);
		}
		if(clr.equals("YELLOW"))
		{
			g.setColor(Color.yellow);
			g.fillOval(225,195,50,50);
		}
		if(clr.equals("GREEN"))
		{
			g.setColor(Color.green);
			g.fillOval(225,255,50,50);
		}
	}
}