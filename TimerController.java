import java.util.*;
import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.paint.*;
import javafx.stage.*;

public class TimerController extends Application {

    //private TimerModel model;
    private TimerView inputView;

    public TimerController(){
        //model = new TimerModel();
        inputView = new TimerView();

        //inputView.setButtonAddAction(this::addWorker);
        //inputView.setButtonDisplayWorkersAction(this::displayWorkers);
        //inputView.setButtonProcessAction(this::displayProcess);
    }

    @Override
    public void start(Stage primaryStage){
        TimerController controller = new TimerController();

        Scene scene = new Scene(controller.inputView.getParent(), 700, 300, Color.TRANSPARENT);
        primaryStage.setTitle("JavaFX Timer");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /*
    private void addWorker(ActionEvent event){
        String name = inputView.getTextfieldName();
        int id = inputView.getTextfieldID();
        Shift shift = inputView.getComboShift();
        Worker worker = new Leader(name, id, shift);
        department.addWorker(worker);
        inputView.setTextAction(name + " Added");
        inputView.clearInputs();
    }
    private void displayWorkers(ActionEvent event){
        ArrayList<Worker> workerList = department.getWorkerList();
        String output = "";
        for (Worker worker : workerList) {
            output += worker.getName() + " (ID: " + worker.getId() + ") [" + worker.getShift() + "]\n";
        }
        inputView.setTextareaResults(output);
        inputView.setTextAction("Displaying Workers");
    }
    private void displayProcess(ActionEvent event){
        ArrayList<Worker> workerList = department.getWorkerList();
        String output = "";
        for (Worker worker : workerList) {
            output += worker.getName() + " (ID: " + worker.getId() + ") [" + worker.getShift() + "]" + worker.haveAccess() + "\n";
        }
        inputView.setTextareaResults(output);
        inputView.setTextAction("Keys have been handed out");
    }
    */
    public static void main(String[] args) {
        launch(args);
    }

}
