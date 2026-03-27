import javax.swing.JOptionPane;

public class Test2_bai_6_1 {
    public static void main(String[] args) {
        String[] options = {"Yes", "No"};

        int option = JOptionPane.showOptionDialog(null,
                "Do you want to change to the first class ticket?",
                "Confirm",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        JOptionPane.showMessageDialog(null, "You've chosen: "
                + (option == 0 ? "Yes" : "No"));

        System.exit(0);
    }
}
