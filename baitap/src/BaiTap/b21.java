package BaiTap;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class b21 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		b21 frame = new b21();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public b21() {
		setTitle("Danh sách thành phố");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 400);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(new BorderLayout(10, 10));
		setContentPane(contentPane);
		
		// Danh sách 10 thành phố
		String[] cities = {
			"Hà Nội", "Hồ Chí Minh", "Đà Nẵng", "Cần Thơ", "Hải Phòng",
			"Huế", "Nha Trang", "Vũng Tàu", "Buôn Ma Thuột", "Đà Lạt"
		};
		
		// Tạo JList và thêm vào JScrollPane
		JList<String> cityList = new JList<>(cities);
		JScrollPane scrollPane = new JScrollPane(cityList);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		// Tạo JLabel hiển thị số lượng
		JLabel countLabel = new JLabel("Số lượng thành phố: " + cities.length);
		contentPane.add(countLabel, BorderLayout.SOUTH);
	}
}
