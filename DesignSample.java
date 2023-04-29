import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class DesignSample {
        public static void main(String[] args) {
                JFrame frame = new JFrame("Frontend Design");
                frame.setLayout(new FlowLayout(0));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(1024, 1024);
                frame.setResizable(false);

                // Create a new JMenuBar
                JMenuBar menuBar = new JMenuBar();
                menuBar.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                // Create a File menu and add it to the menu bar

                JMenu fileMenu5 = new JMenu("");
                ImageIcon fileIcon5 = new ImageIcon(
                                new ImageIcon("logo.jpg").getImage().getScaledInstance(50, 10, Image.SCALE_DEFAULT));
                fileMenu5.setIcon(fileIcon5);
                menuBar.add(fileMenu5);

                Border menuBorder5 = BorderFactory.createEmptyBorder(0, 0, 0, 100);
                fileMenu5.setBorder(menuBorder5);

                JMenu fileMenu4 = new JMenu("");
                ImageIcon fileIcon4 = new ImageIcon(
                                new ImageIcon("logo.jpg").getImage().getScaledInstance(50, 10, Image.SCALE_DEFAULT));
                fileMenu4.setIcon(fileIcon4);
                menuBar.add(fileMenu4);

                JMenu fileMenu3 = new JMenu("");
                ImageIcon fileIcon3 = new ImageIcon(
                                new ImageIcon("logo.jpg").getImage().getScaledInstance(50, 10, Image.SCALE_DEFAULT));
                fileMenu3.setIcon(fileIcon3);
                menuBar.add(fileMenu3);

                JMenu fileMenu2 = new JMenu("");
                ImageIcon fileIcon2 = new ImageIcon(
                                new ImageIcon("logo.jpg").getImage().getScaledInstance(50, 10, Image.SCALE_DEFAULT));
                fileMenu2.setIcon(fileIcon2);
                menuBar.add(fileMenu2);
                menuBar.add(Box.createHorizontalGlue());

                JMenu fileMenu1 = new JMenu("");
                ImageIcon fileIcon1 = new ImageIcon(
                                new ImageIcon("logo.jpg").getImage().getScaledInstance(250, 45, Image.SCALE_DEFAULT));
                fileMenu1.setIcon(fileIcon1);
                menuBar.add(fileMenu1);

                Border menuBorder = BorderFactory.createEmptyBorder(0, 100, 0, 0);
                fileMenu1.setBorder(menuBorder);

                JPanel[] cardPanel = new JPanel[4];
                JLabel[] cardTitle = new JLabel[4];
                JLabel[] imagLabel = new JLabel[4];
                ImageIcon imageIcon = new ImageIcon(new ImageIcon("logo.jpg").getImage().getScaledInstance(250, 45, Image.SCALE_DEFAULT));

                for (int i = 0; i < cardPanel.length; i++) {
                        cardPanel[i] = new JPanel();
                        cardTitle[i] = new JLabel("Card:" + i);
                        imagLabel[i] = new JLabel();
                        imagLabel[i].setIcon(imageIcon);
                        cardPanel[i].add(imagLabel[i]);
                        cardPanel[i].setLayout(new BorderLayout());
                        cardPanel[i].setPreferredSize(new Dimension(900, 200));
                        cardPanel[i].setBorder(BorderFactory.createCompoundBorder(
                                        BorderFactory.createEmptyBorder(10, 100, 10, 10),
                                        BorderFactory.createLineBorder(Color.GRAY, 1)));

                        cardTitle[i].setHorizontalAlignment(JLabel.CENTER);
                        cardPanel[i].add(cardTitle[i], BorderLayout.NORTH);
                        frame.add(cardPanel[i]);
                }

                frame.setJMenuBar(menuBar);
                frame.setVisible(true);

        }
}