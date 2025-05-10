package BaiTap;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class b28 {

    public static void main(String[] args) {
        // Tạo JFrame với kích thước 500x400
        JFrame frame = new JFrame("Danh sách sinh viên");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Dữ liệu tĩnh sinh viên
        String[][] data = {
            {"Nguyễn Anh Tuấn", "20", "8.5"},
            {"Lê Thị Bích", "22", "9.0"},
            {"Trần Minh Tuấn", "21", "7.5"},
            {"Phạm Thị Lan", "23", "8.0"},
            {"Vũ Hoàng Nam", "19", "9.2"}
        };

        // Tiêu đề cột
        String[] columns = {"Tên", "Tuổi", "Điểm"};

        // Tạo DefaultTableModel để thêm dữ liệu vào JTable
        DefaultTableModel model = new DefaultTableModel(data, columns);

        // Tạo JTable và gắn model vào
        JTable table = new JTable(model);

        // Đặt bảng trong JScrollPane để có thể cuộn
        JScrollPane scrollPane = new JScrollPane(table);

        // Thêm JScrollPane vào JFrame
        frame.add(scrollPane, BorderLayout.CENTER);

        // Hiển thị JFrame
        frame.setVisible(true);
    }
}

