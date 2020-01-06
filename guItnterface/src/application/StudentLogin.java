package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;


import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.text.Font; 
import javafx.scene.text.FontPosture; 
import javafx.scene.text.FontWeight; 
import javafx.scene.text.Text; 
         
public class StudentLogin extends Application { 
   @Override 
   public void start(Stage stage) {       
      
      
	   
	  Text Tpass = new Text("Password");
	  Text Student = new Text("");
      Text Tusername = new Text("Username");
      Button Login = new Button("Login");
      Button Back = new Button("Back");
      TextField username = new TextField();
      TextField pass = new TextField();
        
      
     
      
      
     
      
      Tpass.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 12));
      Tusername.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 12));
      Login.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 12));
      Back.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 12));
      //setting the position of the text
     
      
      Tpass.setX(50); 
      Tpass.setY(160);
      Tusername.setX(50);
      Tusername.setY(130);
      Login.setLayoutX(50);
      Login.setLayoutY(175);
      Back.setLayoutX(120);
      Back.setLayoutY(175);
      username.setLayoutX(120);
      username.setLayoutY(110);
      pass.setLayoutX(120);
      pass.setLayoutY(140);
      
      
           
    
      Group StRoot = new Group(Tpass, Tusername, Login, Back, username, pass);      
      //Creating a scene object 
     
      Scene Scene = new Scene (StRoot, 775, 300);
      
      //Setting title to the Stage 
      stage.setTitle("Setting Font to the text"); 
         
      //Adding scene to the stage 
      stage.setScene(Scene); 
         
      //Displaying the contents of the stage 
      stage.show();
      
      
       Back.setOnAction(e ->{
      	  stage.setScene(Scene);
        });
      
   }
   public static void main(String args[]){ 
      launch(args); 
   } 
}   