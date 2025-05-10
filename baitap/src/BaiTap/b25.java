package BaiTap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class b25 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JLabel resultLabel;

    public b25() {
        setTitle("Gender Selection");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Căn giữa frame

        // Tạo các radio button
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");

        // Thêm các radio button vào ButtonGroup để đảm bảo chỉ có 1 lựa chọn
        ButtonGroup group = new ButtonGroup();
        group.add(maleRadioButton);
        group.add(femaleRadioButton);

        // Tạo JLabel để hiển thị lựa chọn
        resultLabel = new JLabel("Your selection will appear here.");

        // Thêm sự kiện cho các radio button
        maleRadioButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (maleRadioButton.isSelected()) {
                    resultLabel.setText("You selected: Male");
                }
            }
        });

        femaleRadioButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (femaleRadioButton.isSelected()) {
                    resultLabel.setText("You selected: Female");
                }
            }
        });

        // Sắp xếp giao diện
        setLayout(new FlowLayout());
        add(maleRadioButton);
        add(femaleRadioButton);
        add(resultLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new b25().setVisible(true);
        });
    }
}
