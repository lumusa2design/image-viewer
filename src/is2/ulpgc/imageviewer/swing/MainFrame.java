package is2.ulpgc.imageviewer.swing;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private SwingImageDisplay imageDisplay;

    public MainFrame()  {
        this.setTitle("Image Viewer");
        this.setSize(800, 600);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(e -> System.exit(0));

        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);
        this.setJMenuBar(menuBar);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.setLocationRelativeTo(null);

        this.setResizable(true);

        this.add(createImageDisplay());
    }

    public SwingImageDisplay getImageDisplay() {
        return imageDisplay;
    }

    private Component createImageDisplay() {
        SwingImageDisplay display = new SwingImageDisplay();

        this.imageDisplay = display;
        return display;
    }
}
