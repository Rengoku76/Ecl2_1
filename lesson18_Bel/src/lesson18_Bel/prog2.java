package lesson18_Bel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import com.sun.jna.*;
import com.sun.jna.platform.win32.*;
import com.sun.jna.platform.win32.WinDef.*;
import com.sun.jna.win32.*;
public class prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		okno myOkno = new okno();
	}

}
class okno extends JFrame
{
	private Timer rTimer;
	private JTextArea text;
	private boolean flagExit=false;
	private HWND hwnd;
	private int wWidth,wHeigh;
	public interface MyUser32 extends User32
	{
		static final MyUser32 instance = (MyUser32) Native.loadLibrary("user32",MyUser32.class,W32APIOptions.DEFAULT_OPTIONS);
		public boolean SetWindowPos(HWND hwnd,int hwnd2, int arg1, int arg2, int arg3, int arg4, int flags);
		public int EnableWindow(HWND hwnd, boolean enabled);
		public HWND SetFocus(HWND hwnd);
	}
	private void setAct()
	{
		MyUser32.instance.SetWindowPos(hwnd, -1, 0, 0, wWidth, wHeigh, 0x0040|0x0002|0x0001);
		MyUser32.instance.EnableWindow(hwnd, true);
		MyUser32.instance.SetFocus(hwnd);
	}
	private void setWindow_()
	{
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dm = tk.getScreenSize();
		setBounds(0,0,dm.width,dm.height);
		this.setMinimumSize(dm);
		this.setMaximumSize(dm);
		setUndecorated(true);
		this.requestFocus();
		this.setFocusable(true);
		this.toFront();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		wWidth = dm.width;
		wHeigh = dm.height;
		this.setTitle("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	
	}
	public okno()
	{
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				if (flagExit==false)
				{
					setWindow_();
				}
			}
		});
		rTimer = new Timer(10,new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setAct();
			}
		});
		rTimer.start();
		setContent();
		setWindow_();
		hwnd=MyUser32.instance.FindWindow(null, "test");
	}
	private void setContent()
	{
		Container cont = getContentPane();
		JPanel pan = new JPanel();
		pan.setLayout(null);
		Font labFont1 = new Font("serif",0,40);
		Font labFont2 = new Font("serif",0,20);
		JLabel lab1 = new JLabel("ВАШ КОМПЬЮТЕР ЗАБЛОКИРОВАН!");
		lab1.setForeground(Color.BLUE);
		lab1.setFont(labFont1);
		lab1.setBounds(50,0,800,100);
		pan.add(lab1);
		JLabel lab2 = new JLabel("Вас приветвует блокировщик Windows!");
		lab2.setForeground(Color.RED);
		lab2.setFont(labFont2);
		lab2.setBounds(50,50,800,100);
		pan.add(lab2);
		JLabel lab3 = new JLabel("Поздравляем вас с праздником 8 марта!!!");
		lab2.setForeground(Color.GREEN);
		lab2.setFont(labFont1);
		lab2.setBounds(50,100,800,100);
		pan.add(lab3);
		
		JLabel lab4 = new JLabel("Для снятия блокировки введите ваше имя:");
		lab2.setForeground(Color.BLUE);
		lab2.setFont(labFont2);
		lab2.setBounds(50,150,800,100);
		pan.add(lab4);
		
		text = new JTextArea();
		text.setFont(labFont2);
		text.setBounds(50,250,300,35);
		text.setForeground(new Color(0,0,100));
		text.setBackground(Color.WHITE);
		pan.add(text);
		
		JButton btn = new JButton("Ввести");
		btn.setSize(150,35);
		btn.setFont(labFont2);
		btn.setLocation(50,300);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = text.getText().toLowerCase().trim();
				String test = (String)"маша";
				
				if (str.equals(test))
				{
					rTimer.stop();
					
					JOptionPane.showMessageDialog(null, "Еще раз поздравялем!!! Всего доброго!");
					flagExit=true;
					System.exit(0);
				}
				else
				text.setText("Ответ неверный!");
				}});
		pan.add(btn);
		cont.add(pan);
	}
}
