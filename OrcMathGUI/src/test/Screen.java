package test;

import java.util.List;

import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;
 
public class Screen extends FullFunctionScreen
{
    private TextLabel countdown;
    private TextLabel scoreLabel;
    private Button button;
    private int score;
    private int clicks;
    private boolean clicked1;
    private boolean clicked2;
   
    public Screen(int width, int height)
    {
        super(width, height);
    }
 
    @Override
    public void initAllObjects(List<Visible> viewObjects)
    {
        String s = "Score: "+score;
        clicks = 0;
       
       
        scoreLabel = new TextLabel(30,50,200,200, s);
        viewObjects.add(scoreLabel);
       
        countdown = new TextLabel(30,80,200,200,"");
        viewObjects.add(countdown);
       
        button = new Button(30,150,200,200, "Ready",new Action() {
           
            @Override
            public void act() {
               
                if (!clicked1)
                {
                    new Thread()
                    {
                        public void run()
                        {
                            try
                            {
                                countdown.setText("3");
                                Thread.sleep(1000);
                                countdown.update();
                                countdown.setText("2");
                                Thread.sleep(1000);
                                countdown.update();
                                countdown.setText("1");
                                Thread.sleep(1000);
                                countdown.update();                            
                                countdown.setText("Go!");
                                countdown.update();
                                button.setText("Click me!");
                                button.update();
                               
                               
                            }
                            catch (InterruptedException e)
                            {
                                e.printStackTrace();
                            }
                        }
                    } .start();
                    clicked1 = true;
                }
                else
                {
                    if (!clicked2)
                    {
                        new Thread()
                        {
                            public void run()
                            {
                                try
                                {
                                    countdown.setText("5");
                                    Thread.sleep(1000);
                                    countdown.update();
                                    countdown.setText("4");
                                    Thread.sleep(1000);
                                    countdown.update();
                                    countdown.setText("3");
                                    Thread.sleep(1000);
                                    countdown.update();                            
                                    countdown.setText("2");                                
                                    countdown.update();
                                    Thread.sleep(1000);
                                    countdown.setText("1");
                                    Thread.sleep(1000);
                                    countdown.update();                            
                                    countdown.setText("0");
                                    countdown.update();
                                    button.setText("Done");
                                    button.update();                                   
                                   
                                }
                                catch (InterruptedException e)
                                {
                                    e.printStackTrace();
                                }
                            }
                        } .start();
                        clicked2 = true;
                    }
                    else
                    {
                        if (!countdown.getText().equals("0"))
                        {
                            clicks++;
                            scoreLabel.setText(clicks+"");
                        }
                    }
                }
            }
        });
        viewObjects.add(button);
    }
 
}