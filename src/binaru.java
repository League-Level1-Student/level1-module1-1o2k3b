import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binaru implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField field = new JTextField();
	JLabel label = new JLabel();
	JTextField answer = new JTextField(20);
	JButton button = new JButton();
	private void run(){
button.addActionListener(this);
	button.setVisible(true);
	frame.setVisible(true);
	label.setVisible(true);
	field.setVisible(true);
	panel.setVisible(true);
	answer.setVisible(true);
	
	frame.add(panel);
	panel.add(button); 
	panel.add(label);
	panel.add(field);
	panel.add(answer);
	}
	public static void main(String[] args) {
binaru bin = new binaru();
bin.run();
	
}
String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	convert("01000001");
	answer.setText(convert(answer.getText()));
}

}
