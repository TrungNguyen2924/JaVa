package BaiTap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class b24 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JCheckBox checkBox;

	public b24() {
		setTitle("Checkbox Background Demo");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // căn giữa

		// Tạo checkbox
		checkBox = new JCheckBox("Enable Background");

		// Thêm sự kiện
		checkBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (checkBox.isSelected()) {
					getContentPane().setBackground(Color.GREEN);
				} else {
					getContentPane().setBackground(null); // về mặc định
				}
			}
		});

		// Thêm vào frame
		setLayout(new FlowLayout());
		add(checkBox);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new b24().setVisible(true);
		});
	}
}
