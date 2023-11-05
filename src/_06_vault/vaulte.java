package _06_vault;

import javax.swing.JOptionPane;
import _06_vault.Vault;
import _06_vault.secretagent;

public class vaulte {
public static void main(String[] args) {
	Vault vault = new Vault();
	secretagent agent = new secretagent();
	agent.findCode(vault);
	String string = JOptionPane.showInputDialog("guess the number 1 to 1 million");
    int x=Integer.parseInt(string);
    
    //vault.tryCode(x);
System.out.println(vault.tryCode(x));
    

}
}
