package is2.ulpgc.imageviewer.swing;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private SwingImageDisplay imageDisplay;

    public MainFrame()  {
        this.setTitle("Image Viewer");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(createImageDisplay());
    }

    public SwingImageDisplay getImageDisplay() {
        return imageDisplay;
    }

    private Component createImageDisplay() {
        SwingImageDisplay display = new SwingImageDisplay();

        this.imageDisplay = display;
        return display;
    }}