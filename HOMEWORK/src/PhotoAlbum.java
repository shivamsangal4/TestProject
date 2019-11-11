import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PhotoAlbum extends JFrame
{
	JLabel label;
	JButton button1, button2, button3, button4;
	public void showUi()
	{
		super.setBounds(100, 100, 700, 600);		
		//super.setResizable(false);
		
		label = new JLabel();
		label.setBounds(100, 100, 200,200);
		super.add(label);
		
		button1 = new JButton();
		button1.setBounds(100, 300, 30, 30);
		super.add(button1);
		
		button2 = new JButton();
		button2.setBounds(130, 300, 30, 30);
		super.add(button2);
		
		button3 = new JButton();
		button3.setBounds(160, 300, 30, 30);
		super.add(button3);
		
		ImageIcon icon = new ImageIcon("C:\\Users\\shiva\\Desktop\\nanital\\IMG_20180314_200556.jpg");
		label.setIcon(icon);
		super.setLayout(null);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
