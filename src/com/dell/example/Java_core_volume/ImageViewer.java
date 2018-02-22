package com.dell.example.Java_core_volume;

import javax.swing.*;
import java.awt.*;
import java.io.File;

/**
 * Created by 20304 on 2018/1/25.
 */
public class ImageViewer {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new ImageViewerFrame();
        });
    }
}
class ImageViewerFrame extends JFrame
{
    private JLabel label;
    private JFileChooser chooser;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 400;
    public ImageViewerFrame()
    {
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        //use a label to display the images
        label = new JLabel();
        add(label);
        //set up the file chooser
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        //set up the menu
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("File");
        menuBar.add(menu);
        JMenuItem openItem = new JMenuItem("Open");
        menu.add(openItem);
        openItem.addActionListener(event -> {
            //show file chooser dialog
            int result = chooser.showOpenDialog(null);
            //if file selected ,set it as icon of the label
            if(result == JFileChooser.APPROVE_OPTION)
            {
                String name = chooser.getSelectedFile().getPath();
                label.setIcon(new ImageIcon(name));
            }
        });
        JMenuItem exitItem = new JMenuItem("Exit");
        menu.add(exitItem);
        exitItem.addActionListener(event->System.exit(0));
    }
}
