package feladat05;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;


public class EloadasokFrame {

	private JFrame frmEloadasok;
	private JList list;
	
	private DefaultListModel<Eloadas> listModel;
	


	public JFrame getFrmEloadasok() {
		return frmEloadasok;
	}

	
	public EloadasokFrame() throws SQLException {
		initialize();
		
		
	}


	private void initialize() throws SQLException {
		
		try {
			ABKezelo.csatlakozas();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			List<Eloadas> eloadasok = ABKezelo.eloadasokBeolvasasa();

		
		frmEloadasok = new JFrame();	
		frmEloadasok.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				if (JOptionPane.showOptionDialog(frmEloadasok, "Biztos ki akar lépni?", "Kilépés", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
						null, null, e)==(JOptionPane.YES_OPTION)) {
					System.exit(0);
					//frmFoAblak.disable();
				}
			}
		});
		frmEloadasok.setTitle("Színházi előadások");
		frmEloadasok.setBounds(100, 100, 700, 400);
		frmEloadasok.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frmEloadasok.getContentPane().setLayout(null);
		
		list = new JList();
		list.setBounds(45, 47, 369, 285);
		frmEloadasok.getContentPane().add(list);

		
		listModel = new DefaultListModel<Eloadas>();
		
		for (Eloadas eloadas : eloadasok) {
			listModel.addElement(eloadas);
		}

		list.setModel(listModel);

		
		JButton btnKilepes = new JButton("Kilépés");
		btnKilepes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				frmEloadasok.dispatchEvent(new WindowEvent(frmEloadasok, WindowEvent.WINDOW_CLOSING));

				
				
			}
		});
		btnKilepes.setBounds(463, 81, 189, 63);
		frmEloadasok.getContentPane().add(btnKilepes);
		
	}
}
