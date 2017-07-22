package main;

import java.awt.Dimension;
import java.io.*;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

/**

 @author Rachel, Matt
 */
public class Main extends Application
{

    private static final JTextPane textPane = new JTextPane();
    
    /**
     @param args the command line arguments don't do anything
     */
    public static void main(String[] args)
    {
        launch();

////        SwingTerminal theTerminal = new SwingTerminal();
//        
//       
//        
//        //JFrame mainGUI = new JFrame();
//        
//        Box theBox = new Box(BoxLayout.Y_AXIS);
//        
//        JTextField inputField = new JTextField();
//        
//        //mainGUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        
////        mainGUI.add(theTerminal);
//        
//        textPane.setMinimumSize(new Dimension(300,300));
//        
//        textPane.setPreferredSize(new Dimension(300, 300));
//
//        theBox.add(textPane);
//        
//        theBox.add(inputField);
//
//        mainGUI.add(theBox);
//        
//        mainGUI.setMinimumSize(new Dimension(300, 300));
//        
//        mainGUI.pack();
//        
//        mainGUI.setLocation(0,0);
//        
//        mainGUI.setVisible(true);
//        
//        redirectSystemStreams();
//        
//        System.out.println("Welcome to Surivivor-Sim!");
////
////        playGame();
////
////        Scanner input = new Scanner(System.in);
////
////        boolean keepAsking = true;
////
////        String line = "";
////
////        
////        System.out.println("play again?(y/n)");
////
////        while (keepAsking)
////        {
////            line = input.next();
////
////            System.out.println("debug 1");
////
////            switch (line)
////            {
////                case ("Y"):
////                case ("y"):
////                    playGame();
////                    System.out.println("play again?(y/n)");
////                    break;
////                case ("N"):
////                case ("n"): keepAsking = false;
////                    break;
////                default: System.out.println("play again?(y/n)");
////            }
////
////        }
//        
        System.out.println("Goodbye!");

    }

    
    private static void updateTextPane(final String text)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                Document doc = textPane.getDocument();
                try
                {
                    doc.insertString(doc.getLength(), text, null);
                } catch (BadLocationException e)
                {
                    throw new RuntimeException(e);
                }
                textPane.setCaretPosition(doc.getLength() - 1);
            }
        });
    }

    private static void redirectSystemStreams()
    {
        OutputStream out = new OutputStream()
        {
            @Override
            public void write(final int b) throws IOException
            {
                updateTextPane(String.valueOf((char) b));
            }

            @Override
            public void write(byte[] b, int off, int len) throws IOException
            {
                updateTextPane(new String(b, off, len));
            }

            @Override
            public void write(byte[] b) throws IOException
            {
                write(b, 0, b.length);
            }
        };

        System.setOut(new PrintStream(out, true));
        System.setErr(new PrintStream(out, true));
    }
    
    
    
    
    
    private static void playGame()
    {

        System.out.println("Starting new game");

        while (remainingContestants.size() > FINALE_CONTESTANTS)
        {
            runDay();
            day++;
        }

        System.out.println("Thanks for playing!");

    }

    private static void runHour()
    {
        System.out.println(hour + ":00");
    }

    /**
     NOW: This is a lot but... Create reward challenge method Create immunity
     challenge method Create tribal council method (We can figure out a system
     to have these each every few days)
     <p>
     And also just like a general neutral day thing where you get the option to
     relax/sleep, look for immunity idol, be social, etc. So maybe if the day is
     a certain multiple we can have the special things like challenges, tribal
     council, etc. but otherwise not
     <p>
     and maybe eventually we can add a random number generator where if it gets
     a certain number certain cool/random things happen (like you see an animal
     or something)
     <p>
     and then we can also incorporate when it gets to a certain day special
     things happen (such as merge, loved ones visit, auction challenge, etc. any
     fun things we want to add!)
     */
    private static void runDay()
    {

        System.out.println("Starting day " + day);

        for (int i = 0; i < 24; i++)
        {
            runHour();
            hour++;
            if (hour == 24)
            {
                hour = 0;
            }
        }

    }

    static int getTotalContestants()
    {
        return TOTAL_CONTESTANTS;
    }

    static ArrayList<Contestant> getAllContestants()
    {
        @SuppressWarnings ("unchecked")
        ArrayList<Contestant> listClone = (ArrayList<Contestant>) allContestants.clone();
        return listClone;
    }

    private static final int TOTAL_CONTESTANTS = 18;

    private static final int FINALE_CONTESTANTS = 3;

    private static int day = 0;

    private static int hour = 6;

    private static ArrayList<Contestant> allContestants = new ArrayList<>(TOTAL_CONTESTANTS);

    private static ArrayList<Contestant> remainingContestants = new ArrayList<>(TOTAL_CONTESTANTS);

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane grid = new GridPane();
        
        grid.setGridLinesVisible(true);
        RowConstraints top = new RowConstraints();
        top.setPercentHeight(50);
        RowConstraints bottom = new RowConstraints();
        bottom.setPercentHeight(50);
        grid.getRowConstraints().addAll(top, bottom);
        ColumnConstraints left = new ColumnConstraints();
        left.setPercentWidth(50);
        ColumnConstraints right = new ColumnConstraints();
        right.setPercentWidth(50);
        grid.getColumnConstraints().addAll(left, right);
        Label label = new Label("hi my name is label");
        grid.add(label, 0, 0);
        Button button = new Button("button shmutton");
        grid.add(button, 0, 1);
        TextField textField = new TextField();
        grid.add(textField, 1, 0);
        Rectangle rectangle = new Rectangle(10, 20);
        grid.add(rectangle, 1, 1);
        button.setOnAction((e)->
        {
           label.setText(textField.getText());
        });
//        
           
        
        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        
        
        primaryStage.show();
        primaryStage.centerOnScreen();
    }

}
