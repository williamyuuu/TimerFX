import java.util.*;
import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.paint.*;
import javafx.stage.*;

public class TimerController extends Application {

    private int sceneWidth = 700; //This can possibly constant/final
    private int sceneHeight = 300; //This is for changing mainBox when adding more timer rows

    //private TimerModel model;
    private TimerView inputView;

    public TimerController(){
        //model = new TimerModel();
        inputView = new TimerView();

        inputView.setButtonAddNewTimerAction(this::addNewTimer);
    }
    @Override
    public void start(Stage primaryStage){
        TimerController controller = new TimerController();

        Scene scene = new Scene(controller.inputView.getParent(), sceneWidth, sceneHeight, Color.TRANSPARENT);
        primaryStage.setTitle("JavaFX Timer");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private void addNewTimer(ActionEvent event){
        System.out.println("New Timer Button Clicked");
        // Everytime you add timer, update the View to be bigger height
        //sceneHeight += 60;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
