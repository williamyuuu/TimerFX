import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.paint.*;
import javafx.geometry.*;
import javafx.event.*;

import javafx.application.*;
import javafx.stage.*;

public class TimerView extends Application{

    MenuBar menuBar;
    Menu menuFile, menuOptions, menuHelp;
    MenuItem fileItem1, fileItem2, optionsItem1, optionsItem2, helpItem1, helpItem2;
    Button buttonAddNewTimer, buttonAddTime;
    TextField fieldName, fieldMap, fieldCh, fieldPaid;
    Text textName, textMap, textCh, textPaid;
    VBox mainBox;

    @Override
    public void start(Stage primaryStage){

        // MenuBar,Menu,MenuItems --> MenuBar menuBar
        menuFile = new Menu("File");
        menuOptions = new Menu("Option");
        menuHelp = new Menu("Help");

        fileItem1 = new MenuItem("New");
        fileItem2 = new MenuItem("Save");
        menuFile.getItems().addAll(fileItem1, fileItem2);

        optionsItem1 = new MenuItem("Settings");
        optionsItem2 = new MenuItem("Configs");
        menuOptions.getItems().addAll(optionsItem1, optionsItem2);

        helpItem1 = new MenuItem("About Me");
        helpItem2 = new MenuItem("Report Issue");
        menuHelp.getItems().addAll(helpItem1, helpItem2);

        menuBar = new MenuBar(menuFile, menuOptions, menuHelp);

        //Buttons --> HBox buttons
        buttonAddNewTimer = new Button("Add New Timer");
        BorderPane buttons = new BorderPane();
        buttons.setRight(buttonAddNewTimer);
        buttons.setMargin(buttonAddNewTimer, new Insets(0,12,0,0));

        //text and fields --> HBox subBox
        textName = new Text("Name: ");
        textMap = new Text("Map: ");
        textCh = new Text("Ch: ");
        textPaid = new Text("Paid: ");
        fieldName = new TextField();
        fieldMap = new TextField();
        fieldCh = new TextField();
        fieldPaid = new TextField();

        HBox name = new HBox(textName, fieldName);
        name.setAlignment(Pos.CENTER);
        HBox map = new HBox(textMap, fieldMap);
        map.setAlignment(Pos.CENTER);
        HBox ch = new HBox(textCh, fieldCh);
        ch.setAlignment(Pos.CENTER);
        HBox paid = new HBox(textPaid, fieldPaid);
        paid.setAlignment(Pos.CENTER);

        HBox subBox = new HBox(name, map, ch, paid);
        subBox.setAlignment(Pos.CENTER);
        subBox.setSpacing(30);

        //VBox mainBox
        mainBox = new VBox(menuBar,buttons, subBox);
        mainBox.setSpacing(20);

        Scene scene = new Scene(mainBox, 700, 300, Color.LIGHTGREY);
        primaryStage.setTitle("JavaFX Timer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
