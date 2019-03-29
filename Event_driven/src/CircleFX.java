import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleFX extends Application {
  private CirclePane circlePane = new CirclePane();

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Hold two buttons in an HBox
    HBox hBox = new HBox();
    hBox.setSpacing(10);
    hBox.setAlignment(Pos.CENTER);
    Button btEnlarge = new Button("Enlarge");
    Button btShrink = new Button("Shrink");
    hBox.getChildren().add(btEnlarge);
    hBox.getChildren().add(btShrink);
    
//    btEnlarge.setOnAction(new EventHandler<ActionEvent>() {
//					      	@Override
//					      	public void handle(ActionEvent event) {
//					      		// TODO Auto-generated method stub
//					      		circlePane.enlarge();
//					      	}
					      	
//					      });
    
    btEnlarge.setOnAction(e -> circlePane.enlarge());
    
    btShrink.setOnAction(new EventHandler<ActionEvent>() {
					      	@Override
					      	public void handle(ActionEvent event) {
					      		// TODO Auto-generated method stub
					      		circlePane.shrink();
					      	}
					      	
					      });

    // Create a BorderPane object, borderPane
    // Place circlePane at the center of borderPane object
    BorderPane borderPane = new BorderPane();
    borderPane.setCenter(circlePane);


    // Place hBox at the bottom of borderPane object
    // Set alignment such that hBox is located at the center.
    borderPane.setBottom(hBox);
    BorderPane.setAlignment(hBox, Pos.CENTER);


    // Create a scene and place it in the stage
    Scene scene = new Scene(borderPane, 300, 200);
    primaryStage.setTitle("ControlCircle"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

  /**
   * Define a class called EnlargeHandler that implements the
   * interface EventHandler<ActionEvent>.
   * Then this class must override handle(ActionEvent e).
   */
//  class EnlargeHandler implements EventHandler<ActionEvent> {
//  	@Override
//  	public void handle(ActionEvent event) {
//  		// TODO Auto-generated method stub
//  		circlePane.enlarge();
//  	}
//  	
//  }
//  
//  class ShrinkHandler implements EventHandler<ActionEvent> {
//  	@Override
//  	public void handle(ActionEvent event) {
//  		// TODO Auto-generated method stub
//  		circlePane.shrink();
//  	}
//  	
//  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}


class CirclePane extends StackPane {
  private Circle circle = new Circle(50);

  public CirclePane() {
    getChildren().add(circle);
    circle.setStroke(Color.BLACK);
    circle.setFill(Color.WHITE);
  }

  public void enlarge() {
    circle.setRadius(circle.getRadius() + 2);
  }

  public void shrink() {
    circle.setRadius(circle.getRadius() > 2 ?
      circle.getRadius() - 2 : circle.getRadius());
  }
}