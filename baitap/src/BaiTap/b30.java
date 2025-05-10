package BaiTap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class b30 {

    public static void main(String[] args) {
        // Tạo JFrame với kích thước 500x400
        JFrame frame = new JFrame("JToolBar Example");
        frame.setSize(629, 463);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

        // Tạo JToolBar
        JToolBar toolBar = new JToolBar();

        // Tạo các JButton và thêm vào toolBar
        JButton newButton = new JButton("New");
        JButton saveButton = new JButton("Save");
        JButton openButton = new JButton("Open");

        toolBar.add(newButton);
        toolBar.add(saveButton);
        toolBar.add(openButton);

        // Thêm ActionListener cho từng JButton để hiển thị JOptionPane
        newButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "New button clicked", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Save button clicked", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        openButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Open button clicked", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Thêm toolBar vào JFrame
        frame.getContentPane().add(toolBar, BorderLayout.NORTH);

        // Hiển thị JFrame
        frame.setVisible(true);
    }
}

