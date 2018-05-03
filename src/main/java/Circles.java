import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Circles extends Application {

	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();

		drawCircles(pane, 20, 319, 239, 2);

		Scene scene = new Scene(pane, 640, 480);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Circles");
		primaryStage.show();
	}


	private void drawCircles(Pane p, int numCircles, double x, double y, double radius){
		//Base case
		if(numCircles <= 0){
			return;
		}

		//Recursive case
		//First draw the current circle
		Circle c = new Circle(x, y, radius, null);
		c.setStroke(Color.SILVER);
		p.getChildren().add(c);
		//Draw the remaining circles
		drawCircles(p, numCircles - 1, x, y, radius + 10);

	}
}
