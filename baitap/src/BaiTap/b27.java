package BaiTap;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class b27 {

    public static void main(String[] args) {
        // Tạo JFrame
        JFrame frame = new JFrame("JProgressBar Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Tạo JProgressBar
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);  // Hiển thị số phần trăm
        frame.add(progressBar, BorderLayout.CENTER);

        // Tạo JButton "Start"
        JButton startButton = new JButton("Start");
        frame.add(startButton, BorderLayout.SOUTH);

        // Thêm hành động khi nhấn nút Start
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Tạo một thread để cập nhật giá trị JProgressBar
                new Thread(new Runnable() {
                    public void run() {
                        for (int i = 0; i <= 100; i++) {
                            try {
                                // Cập nhật giá trị của progressBar
                                progressBar.setValue(i);
                                // Dừng 50ms để tạo hiệu ứng
                                Thread.sleep(10);
                            } catch (InterruptedException ex) {
                                ex.printStackTrace();
                            }
                        }
                    }
                }).start();
            }
        });

        // Hiển thị JFrame
        frame.setVisible(true);
    }
}
