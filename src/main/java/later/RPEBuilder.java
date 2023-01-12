package later;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class RPEBuilder {

    private JFrame frame;
    private double[] percent;
    private double oneRepMax;
    
    public RPEBuilder() {

        frame = new JFrame("RPE Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLayout(new GridLayout(9, 13, 5, 5));

            JMenuBar menuBar = new JMenuBar();
            JMenu fileMenu = new JMenu("File");
            JMenuItem newMenuItem = new JMenuItem("New");

            JMenuItem saveMenuItem = new JMenuItem("Save");

            fileMenu.add(newMenuItem);
            fileMenu.add(saveMenuItem);

            menuBar.add(fileMenu);

//        newMenuItem.addActionListener(new NewMenuItemListener());
//        saveMenuItem.addActionListener(new SaveMenuItemListener());
            frame.setJMenuBar(menuBar);

            frame.setVisible(true);


        }
    }

//    class NewMenuItemListener implements ActionListener {
//
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//
//
//        }
//    }
//    class SaveMenuItemListener implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//
//            //create a file dialog with file chooser
//            JFileChooser fileSave = new JFileChooser();
//            fileSave.showSaveDialog(frame);
//            saveFile(fileSave.getSelectedFile());
//        }
//    }

//    private void saveFile(File selectedFile) {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile));
//
//            Iterator<RPE> RPEIterator = .iterator();
//            while(cardIterator.hasNext()) {
//                FlashCard card = (FlashCard) cardIterator.next();
//                writer.write(card.getQuestion() + "/");
//                writer.write(card.getAnswer() + "\n");
//            }
//            writer.close();
//    }


