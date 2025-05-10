package BaiTap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class b23 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField display;
	private String currentInput = "";

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			b23 frame = new b23();
			frame.setVisible(true);
		});
	}

	public b23() {
		setTitle("Máy Tính Đơn Giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 400);
		setLocationRelativeTo(null);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		// Ô hiển thị kết quả
		display = new JTextField();
		display.setEditable(false);
		display.setFont(new Font("Arial", Font.BOLD, 20));
		display.setHorizontalAlignment(SwingConstants.RIGHT);

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 4;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(5, 5, 5, 5);
		add(display, gbc);

		// Các nút máy tính
		String[] buttons = {
			"7", "8", "9", "/",
			"4", "5", "6", "*",
			"1", "2", "3", "-",
			"0", "=", "+", 
		};

		int index = 0;
		for (int row = 1; row <= 4; row++) {
			for (int col = 0; col < 4; col++) {
				if (index >= buttons.length) break;

				String label = buttons[index++];
				JButton button = new JButton(label);
				button.setFont(new Font("Arial", Font.BOLD, 18));
				gbc.gridx = col;
				gbc.gridy = row;
				gbc.gridwidth = 1;
				add(button, gbc);

				// Xử lý sự kiện
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						handleButtonClick(label);
					}
				});
			}
		}
	}

	// Xử lý nút bấm
	private void handleButtonClick(String label) {
		if (label.equals("=")) {
			try {
				double result = eval(currentInput);
				display.setText(currentInput + " = " + result);
				currentInput = "" + result;
			} catch (Exception e) {
				display.setText("Lỗi");
				currentInput = "";
			}
		} else {
			currentInput += label;
			display.setText(currentInput);
		}
	}

	// Hàm tính toán đơn giản (chỉ xử lý + - * /)
	private double eval(String input) {
		// Không sử dụng eval JavaScript, đây là cách thô sơ dùng script engine:
		javax.script.ScriptEngine engine = new javax.script.ScriptEngineManager().getEngineByName("JavaScript");
		try {
			return Double.parseDouble(engine.eval(input).toString());
		} catch (Exception e) {
			throw new RuntimeException("Lỗi tính toán");
		}
	}
}
