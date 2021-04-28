import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SimpleFoodOrder {
    private final JFrame frame;
    private final JCheckBox checkbox1;
    private final JCheckBox checkbox2;
    private final JCheckBox checkbox3;
    private final JButton button;
    private final JComboBox cb1;
    private final JComboBox cb2;
    private final JComboBox cb3;

    SimpleFoodOrder() {
        Integer[] arr = new Integer[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        frame = new JFrame("Food Order System");
        checkbox1 = new JCheckBox("Tea-10/-");
        checkbox1.setBounds(130, 70, 100, 50);
        cb1 = new JComboBox(arr); //combo1
        cb1.setBounds(270, 78, 40, 20);
        checkbox2 = new JCheckBox("Coffee-15/-");
        checkbox2.setBounds(130, 110, 100, 50);
        cb2 = new JComboBox(arr);  //combo2
        cb2.setBounds(270, 116, 40, 20);
        checkbox3 = new JCheckBox("Pizza-20/-");
        checkbox3.setBounds(130, 140, 100, 50);
        cb3 = new JComboBox(arr); //combo3
        cb3.setBounds(270, 147, 40, 20);
        button = new JButton("Click");
        button.setBounds(140, 200, 100, 30);
        button.addActionListener(new ActionListener() {
            float Total = 0;
            String msg = "";

            public void actionPerformed(ActionEvent ex) {

                if (!checkbox1.isSelected() && !checkbox2.isSelected() && !checkbox3.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Please check any one of the box");
                } else {

                    if (checkbox1.isSelected()) {
                        Integer quantity = (Integer) cb1.getSelectedItem();
                        if (quantity > 0) {
                            Total += quantity * 10;
                            msg += "Tea : 10 " + "\t Quantity : " + quantity + " \n";
                        }


                    }
                    if (checkbox2.isSelected()) {
                        Integer quantity = (Integer) cb2.getSelectedItem();
                        if (quantity > 0) {
                            Total += quantity * 15;
                            msg += "Coffee : 15 " + "\t Quantity : " + quantity + " \n";
                        }


                    }
                    if (checkbox3.isSelected()) {
//                        System.out.println((cb3.getSelectedItem().getClass().getSimpleName()));
                        Integer quantity = (Integer) (cb3.getSelectedItem());
                        if (quantity > 0) {
                            Total += quantity * 20;
                            msg += "Pizza : 20 " + "\t Quantity : " + quantity + " \n";
                        }


                    }


                }

                if (Total == 0) {
                    JOptionPane.showMessageDialog(null, "Please select an item ");
                    Total = 0;
                    msg = "";

                } else {

                    JOptionPane.showMessageDialog(null, msg + "Total Amount : " + Total);
                    Total = 0;
                    msg = "";
                }


            }
        });
        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.add(checkbox3);
        frame.add(cb1);
        frame.add(cb2);
        frame.add(cb3);
        frame.add(button);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleFoodOrder();
    }
}


