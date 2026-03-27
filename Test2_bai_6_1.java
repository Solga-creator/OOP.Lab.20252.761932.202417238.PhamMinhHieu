import javax.swing.JOptionPane;

public class Test2 {
    public static void main(String[] args) {
        String[] options = {"Yes", "No"};
        
        int option = JOptionPane.showOptionDialog(null,
                "Do you want to change to the first class ticket?",
                "Confirm",
                JOptionPane.YES_NO_OPTION,      // kiểu hộp thoại
                JOptionPane.QUESTION_MESSAGE,   // icon hỏi
                null,                           // icon tùy chỉnh (null = mặc định)
                options,                        // mảng nút tùy chỉnh
                options[0]);                    // nút mặc định được chọn

        JOptionPane.showMessageDialog(null, "You've chosen: "
                + (option == 0 ? "Yes" : "No"));
        
        System.exit(0);
    }
}