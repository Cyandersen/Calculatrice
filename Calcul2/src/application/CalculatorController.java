package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class CalculatorController {

    @FXML
    private Button div;

    @FXML
    private Button sus;

    @FXML
    private Button add;

    @FXML
    private Label result;

    @FXML
    private TextField txt2;

    @FXML
    private Button mul;

    @FXML
    private TextField txt1;
    
    int num1=0,num2=0, res=0;
    
    @FXML
    void check1() {
    	checkNum(txt1);
    }
    
    @FXML
    void check2() {
    	checkNum(txt2);
    }
    
    void checkNum(TextField a)
    {
    	try 
    	{
    	num1=Integer.parseInt(a.getText());
    	} catch(NumberFormatException e) 
    	{
    		Alert alert=new Alert(AlertType.ERROR);
    		alert.setHeaderText("Attention - Erreur");
    		alert.setTitle("Erreur");
    		alert.setContentText("Tu dois ecrire un nombre");
    		alert.show();
    		a.requestFocus();
    	}
    }
    
    @FXML
    void calculs(ActionEvent e)
    
    {
    	int num1=Integer.parseInt(txt1.getText());
    	int num2=Integer.parseInt(txt2.getText());
    	int res=0;
    	Button btn=(Button)e.getSource();
    	
    	if(btn.getId().equals("add"))
    		res=num1+num2;
    	else
    		if(btn.getId().equals("sus"))
    			res=num1-num2;
    		else
        		if(btn.getId().equals("div"))
        			res=num1/num2;
        		else
            		if(btn.getId().equals("mul"))
            			res=num1*num2;
    	
    	result.setText(Integer.toString(res));
    	


    	
    	
    
    }
    
    
    
    
  }





