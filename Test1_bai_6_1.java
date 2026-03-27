import javax.swing.JOptionPane;

public class Test1 {
    public static void main(String[] args) {
        String[] options = {"I do", "I don't"};
        
        int option = JOptionPane.showOptionDialog(null,
                "Do you want to change to the first class ticket?",
                "Confirm",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        String choice = (option == 0 ? "I do" : "I don't");
        
        JOptionPane.showMessageDialog(null, "You've chosen: " + choice);
        
        System.exit(0);
    }
}