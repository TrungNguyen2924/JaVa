package BaiTap;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class b22 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox<String> comboBox;
	private JLabel labelSelection;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			b22 frame = new b22();
			frame.setVisible(true);
		});
	}

	/**
	 * Create the frame.
	 */
	public b22() {
		setTitle("Chọn trái cây");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setLocationRelativeTo(null); // căn giữa màn hình

		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(10, 10));
		setContentPane(contentPane);

		// Tạo danh sách trái cây
		String[] fruits = {"Táo", "Cam", "Xoài", "Chuối", "Dưa hấu"};

		// Tạo JComboBox
		comboBox = new JComboBox<>(fruits);
		contentPane.add(comboBox, BorderLayout.NORTH);

		// Tạo JLabel hiển thị lựa chọn
		labelSelection = new JLabel("Bạn chưa chọn loại trái cây nào.");
		contentPane.add(labelSelection, BorderLayout.CENTER);

		// Xử lý sự kiện chọn
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedFruit = (String) comboBox.getSelectedItem();
				labelSelection.setText("Bạn đã chọn: " + selectedFruit);
			}
		});
	}
}
