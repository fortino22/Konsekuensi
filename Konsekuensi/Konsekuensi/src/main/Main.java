package main;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{
	
	private static Stage stage = null;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		stage = primaryStage;
		
		stage.show();
	}

}
