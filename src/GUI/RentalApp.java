package GUI;
import javax.swing.*;
import java.awt.event.*;
import model.Vehicle;
import model.Bike;
import model.Car;
import model.Truck;
import model.InsuredCar;
import java.awt.event.*;

public class RentalApp extends JFrame{  
private JPanel panel;
private JLabel messageLabel;
private JComboBox optionBox;
private JTextField number_days;
private JButton calcButton;
private final int WINDOW_WIDTH = 310; 
private final int WINDOW_HEIGHT = 300;
private double price;


//constructor

public RentalApp(){
    //calling jframe constructor
    super("Rental App");

    //sizing
    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

    //closing
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //building panel
    buildPanel();
    add(panel);

    //setting visibility
    setVisible(true);


}   
//build panel method
private void buildPanel() {
    messageLabel = new JLabel("Enter number of days for renting");

    //textfield
    number_days = new JTextField(10);

    //calcButton
    calcButton = new JButton("Calculate Rent");
    calcButton.addActionListener(new CalcButtonListener());

    //combobox
    Vehicle[] options = {new Car(), new Truck(), new Bike(), new InsuredCar()};
    optionBox = new JComboBox<>(options);

    panel = new JPanel();

    //adding
    panel.add(messageLabel);
    panel.add(number_days);
    panel.add(calcButton);
    panel.add(optionBox);
}

private class CalcButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        String day_input;
        double days;

        

        
        

        //retrieving text from user
        try {
        day_input = number_days.getText();
        
        
        
        days = Double.parseDouble(day_input);

        //retrieving combobox information
        Vehicle selected =  (Vehicle) optionBox.getSelectedItem(); 


        
        //subclass logic
        Double price = selected.calculateRent(days);
      
            
            

        //display
        JOptionPane.showMessageDialog(null, "Total Rent: "+"$" + price + "");
        } catch(NumberFormatException r){
            JOptionPane.showMessageDialog(null, "Error: You need to enter a numeric value");
        }


        
       
        

    
    }
}

// public static void main(String[] args) {
//     new RentalApp();
// }
}

   
