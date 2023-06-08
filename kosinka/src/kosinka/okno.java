package kosinka;
import javax.swing.*;
import java.awt.*;
public class okno extends JFrame
{
	public okno()
	{
		pole panel = new pole();
		Container cont = getContentPane();
		cont.add(panel);
		setTitle("Игра");
	}
}
