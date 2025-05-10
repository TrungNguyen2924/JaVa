package BaiTap;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class b26 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JSlider slider;

    public b26() {
        setTitle("Change Background Color");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Căn giữa frame

        // Tạo JSlider từ 0 đến 255
        slider = new JSlider(0, 255, 0);
        slider.setMajorTickSpacing(50);
        slider.setMinorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        // Thêm sự kiện thay đổi giá trị slider
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                // Lấy giá trị của JSlider
                int value = slider.getValue();
                
                // Đổi màu nền theo giá trị slider (màu sáng thay đổi từ đen đến trắng)
                getContentPane().setBackground(new Color(value, value, value));
            }
        });

        // Thêm slider vào JFrame
        setLayout(new FlowLayout());
        add(slider);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new b26().setVisible(true);
        });
    }
}
