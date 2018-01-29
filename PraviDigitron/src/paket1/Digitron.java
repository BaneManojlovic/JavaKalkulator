/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paket1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

/**
 *
 * @author Branislav
 */
public class Digitron extends Application {
    
    //elementi na gornjem delu
    static TextField displej = new TextField();
    
    //elementi na srednjem delu
    static Button obrisi = new Button("Clear");
    static Button zatvori = new Button("Close");
    
    //glavna ploca
    BorderPane root = new BorderPane();
    

    @Override
    public void start(Stage primaryStage) {
        
        root.setStyle("-fx-background-color: linear-gradient(from 10% 10% to 100% 100%, #005aa7, #fffde4)");
        //gornji deo
        GridPane pane1 = new GridPane();
        pane1.setAlignment(Pos.CENTER);
        pane1.setPadding(new Insets(10, 10, 10, 10));
        displej.setAlignment(Pos.BOTTOM_RIGHT);
        displej.setMaxSize(350, 50);
        displej.setMinSize(350, 50);
        pane1.add(displej, 0, 0);
        
        //srednji deo
        GridPane pane2 = new GridPane();
        pane2.setAlignment(Pos.CENTER);
        pane2.setPadding(new Insets(5, 5, 5, 5));
        pane2.setHgap(5);
        pane2.setVgap(15);
        //pravim niz simbola koje cu prilepiti na dugmice
        String[] brojevi = new String[]{"7", "8", "9", 
                                        "4", "5", "6", 
                                        "3", "2", "1", 
                                        ".", "0", "="};
        String[] opertori = new String[]{"+", "-", "*", "/"};
        //pravim dugmice sa brojevima
        int index=0;
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                Button btn = new Button(brojevi[index]);
                btn.setMaxSize(45, 25);
                btn.setMinSize(45, 25);
                pane2.add(btn, j, i);
                index++;
            }
        }
        
        for(int i=0; i<opertori.length; i++){
            Button btn = new Button(opertori[i]);
            btn.setMaxSize(65, 25);
            btn.setMinSize(65, 25);
            pane2.add(btn, 4, i);
        }
        
        //donji deo
        GridPane pane3 = new GridPane();
        pane3.setAlignment(Pos.CENTER);
        pane3.setPadding(new Insets(10, 10, 10, 10));
        pane3.setHgap(15);
        pane3.add(obrisi, 0, 0);
        pane3.add(zatvori, 1, 0);
        
        //dodajem elemente na glavnu plocu
        root.setTop(pane1);
        root.setCenter(pane2);
        root.setBottom(pane3);
        
        //zatvaranje aplikacije klikom na dugme close
        zatvori.setOnAction(e -> { {primaryStage.close();}});
                
        Scene scena = new Scene(root, 360, 270);
        primaryStage.getIcons().add(new Image("file:C:\\Users\\Branislav\\Documents\\NetBeansProjects\\KI105\\PraviDigitron\\src\\images\\logo.jpg"));
        primaryStage.setTitle("Digiton 1.0");
        primaryStage.setResizable(false);
        primaryStage.setScene(scena);
        primaryStage.show();        
        
    
       }
    
    
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
