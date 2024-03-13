package classcode.FPP.Lesson9.Frame;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().show();
            }
        });
    }
}
