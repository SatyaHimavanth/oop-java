import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;

class CreateLoginForm extends JFrame implements ActionListener{
JButton b1;
JPanel newPanel;
JLabel userLabel,passLabel;
final JTextField textField1,textField2;
CreateLoginForm(){
userLabel = new JLabel();
userLabel.setText("Username");
textField1 = new JTextField(30);
passLabel = new JLabel();
passLabel.setText("Password");
textField2 = new JTextField(15);
b1 = new JButton("SUBMIT");
newPanel = new JPanel(new GridLayout(3,1));
newPanel.add(userLabel);
newPanel.add(textField1);
newPanel.add(passLabel);
newPanel.add(textField2);
newPanel.add(b1);
add(newPanel, BorderLayout.CENTER);
b1.addActionListener(this);
setTitle("Login Form");
}
public void actionPerformed(ActionEvent ae){
String userValue = textField1.getText();
String passValue = textField2.getText();
if(userValue.equals("Satya") && passValue.equals("Himavanth")){
NewPage page = new NewPage();
page.setVisible(true);
JLabel wel_lab = new JLabel("WELCOME user "+userValue);
page.getContentPane().add(wel_lab);
}
else
System.out.println("Username or Password are in-correct");
}
}
class LoginFormDemo{
public static void main(String args[]){
try{
CreateLoginForm form = new CreateLoginForm();
form.setSize(300,100);
form.setVisible(true);
} catch(Exception e){
JOptionPane.showMessageDialog(null, e.getMessage());
}
}
}