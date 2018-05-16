
package javafx_clasespoo;


import javafx.scene.image.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class MyJavaFX extends Application {
    
    
@Override
public void start(Stage primaryStage) throws Exception {
 Scene scene = new Scene(getRoot(), 200, 250);//Boton que coje ese espacio
primaryStage.setTitle("jjyyjX");//El nombre del panel
primaryStage.setScene(scene);
primaryStage.show();
    


  /*primer ejercicio 

/*
Button btOK = new Button("OK");//boton que dice ok y ocupa todo el espacio
Scene scene = new Scene(btOK, 200, 250);//Boton que coje ese espacio
*/
  
 
  

  
  




  }




//SEGUNDO EJEMPLO

  public Pane getHbox() throws FileNotFoundException{
      //primeros botones
Button button1 = new Button("Number 1");
Button button2 = new Button("Number 2");

//mensaje
Label label2= new Label("Etiqueta");//crea un mensaje en el panel con este mensaje


//imagen
FileInputStream input = new FileInputStream("J A URIBE.png");
Image image = new Image(input) {};
Label label3 = new Label("Search",new ImageView(image));


HBox hbox = new HBox(button1,
button2);//Agrega los botones, otra manera de crearlos en el erchivo del profesor
hbox.getChildren().add(label2);//otra manera de crear los componentes de Hbox 
hbox.getChildren().add(label3);//agregar  imagen en el hbox para panel


   return hbox;
  }








  //TERCER EJEMPLO, REVISAR
  public Pane getVbox() throws FileNotFoundException{
  VBox vBox = new VBox();
  Button b1= new Button("Boton");
  Label l1= new Label("Nombre");
  TextField txtCampo= new TextField();
  vBox.getChildren().add(b1);
  vBox.getChildren().add(l1);
  vBox.getChildren().add(getHbox());
  
  return vBox;
  }

  

//CUARTO EJEMPLO
  public Pane getGridPane(){
    
    GridPane pane = new GridPane();
pane.setAlignment(Pos.CENTER);
pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
pane.setHgap(5.5);
pane.setVgap(5.5);
pane.add(new Label("First Name:"), 0, 0);
pane.add(new TextField(), 1, 0);
pane.add(new Label("MI:"), 0, 1, 5, 5);//extiende el tituo de la barra a esta posición
pane.add(new TextField(), 1, 1, 100, 1);// extiende la barra de tecto hasta la posicion
pane.add(new Label("Last Name:"), 0, 2);
pane.add(new TextField(), 1, 2);
Button btAdd = new Button("Add Name");
pane.add(btAdd, 1, 3);
GridPane.setHalignment(btAdd, HPos.RIGHT);


return pane;
  }
  
  
  

  


public Pane getRoot() throws FileNotFoundException{


BorderPane  root= new BorderPane();
root.setTop(new Button ("top"));
root.setRight(getHbox());
root.setLeft(new Button("Left"));
root.setCenter(getGridPane());

return root;

}

public static void main(String[] args) {
Application.launch(args);
}
}

