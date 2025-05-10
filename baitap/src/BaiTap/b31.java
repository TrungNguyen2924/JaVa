package BaiTap;
import javax.swing.*;

public class b31 {

    public static void main(String[] args) {
        // Tạo JFrame với kích thước 600x400
        JFrame frame = new JFrame("JSplitPane Example");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo JList với dữ liệu mẫu
        String[] listData = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
        JList<String> list = new JList<>(listData);

        // Tạo JTextArea
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);  // Đặt chế độ chỉ đọc cho JTextArea

        // Tạo JSplitPane với chiều ngang
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(list), new JScrollPane(textArea));

        // Đặt vị trí chia mặc định là 200 pixel
        splitPane.setDividerLocation(200);

        // Thêm JSplitPane vào JFrame
        frame.add(splitPane);

        // Hiển thị JFrame
        frame.setVisible(true);
    }
}
