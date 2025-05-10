package BaiTap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class b29 {

    public static void main(String[] args) {
        // Tạo JFrame với kích thước 400x300
        JFrame frame = new JFrame("CardLayout Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Tạo CardLayout
        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        // Tạo Card 1 (JLabel "Page 1")
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Page 1"));

        // Tạo Card 2 (JButton "Click")
        JPanel card2 = new JPanel();
        card2.add(new JButton("Click"));

        // Thêm các card vào cardPanel
        cardPanel.add(card1, "Card 1");
        cardPanel.add(card2, "Card 2");

        // Tạo JButton "Switch" để chuyển đổi giữa các card
        JButton switchButton = new JButton("Switch");
        switchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Chuyển đổi giữa các card
                cardLayout.next(cardPanel);
            }
        });

        // Thêm cardPanel và switchButton vào JFrame
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(switchButton, BorderLayout.SOUTH);

        // Hiển thị JFrame
        frame.setVisible(true);
    }
}
