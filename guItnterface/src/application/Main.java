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
         
public class Main extends Application { 
   @Override 
   public void start(Stage stage) {       
      //Creating a Text object 
      Text welcome = new Text(); 
      Text Ques = new Text();
      Button studentB = new Button();
      Button teacherB = new Button();
      
      Text TTpass = new Text("Password");
      Text TTusername = new Text("Username");
      Button TLogin = new Button("Login");
      Button TBack = new Button("Back");
      TextField Tusername = new TextField();
      TextField Tpass = new TextField();
      
      Text SSpass = new Text("Password");
      Text SSusername = new Text("Username");
      Button SLogin = new Button("Login");
      Button SBack = new Button("Back");
      TextField Susername = new TextField();
      TextField Spass = new TextField();
      
      Text studentText = new Text("Student");
      Text teacherText = new Text("Teacher");
 
      Text TID = new Text("Please Enter ID");
      
      
      //Setting font to the text 
      welcome.setFont(Font.font("verdana", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 20)); 
      Ques.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 18)); 
      studentB.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 12));
      teacherB.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 12));
      studentText.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 20));
      teacherText.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 20));
      
      TTpass.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 12));
      TTusername.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 12));
      TLogin.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 12));
      TBack.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 12));
      
      SSpass.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 12));
      SSusername.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 12));
      SLogin.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 12));
      SBack.setFont(Font.font("verdana", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 12));
      
     
      welcome.setX(50); 
      welcome.setY(130);
      Ques.setX(50);
      Ques.setY(160);
      studentB.setLayoutX(50);
      studentB.setLayoutY(170);
      teacherB.setLayoutX(120);
      teacherB.setLayoutY(170);
      
      //Teacher Scene
      teacherText.setX(50);
      teacherText.setY(50);
      TTpass.setX(50); 
      TTpass.setY(160);
      TTusername.setX(50);
      TTusername.setY(130);
      TLogin.setLayoutX(50);
      TLogin.setLayoutY(175);
      TBack.setLayoutX(120);
      TBack.setLayoutY(175);
      Tusername.setLayoutX(120);
      Tusername.setLayoutY(110);
      Tpass.setLayoutX(120);
      Tpass.setLayoutY(140);
      
      
      //Student Scene
      studentText.setX(50);
      studentText.setY(50);
      SSpass.setX(50); 
      SSpass.setY(160);
      SSusername.setX(50);
      SSusername.setY(130);
      SLogin.setLayoutX(50);
      SLogin.setLayoutY(175);
      SBack.setLayoutX(120);
      SBack.setLayoutY(175);
      Susername.setLayoutX(120);
      Susername.setLayoutY(110);
      Spass.setLayoutX(120);
      Spass.setLayoutY(140);
      
      
           
      //Setting the text to be added. 
      welcome.setText("Welcome To the Student Service Learning Hour Database"); 
      Ques.setText("Are you a Student or Teacher?");
      studentB.setText("Student");
      teacherB.setText("Teacher");
      
      
      //Creating a Group object  
      Group root = new Group(welcome, Ques, studentB, teacherB);
      Group StRoot = new Group(studentText, SSusername, SSpass, SLogin, SBack, Susername, Spass); 
      Group TeRoot = new Group(teacherText, TTusername, TTpass, TLogin, TBack, Tusername, Tpass);
      
      //Creating a scene object 
      Scene Homescene = new Scene(root, 775, 300);
      Scene SLoginScene = new Scene (StRoot, 775, 300);
      Scene TLoginScene = new Scene(TeRoot, 400, 300);
      
      //Setting title to the Stage 
      stage.setTitle("Benjamin Castillo"); 
         
      //Adding scene to the stage 
      stage.setScene(Homescene); 
         
      //Displaying the contents of the stage 
      stage.show();
      ///event handlers
      studentB.setOnAction(e -> {
    	  stage.setScene(SLoginScene);
    	    
    	});
      
      teacherB.setOnAction(e -> {
    	  stage.setScene(TLoginScene);
      });
       //event handlers
       SBack.setOnAction(e ->{
      	  stage.setScene(Homescene);
       	});
       TBack.setOnAction(e ->{
       	  stage.setScene(Homescene);
         });
       
       
      
   }
   public static void main(String args[]){ 
      launch(args); 
   } 
}   