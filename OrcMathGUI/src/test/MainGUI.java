package test;

import guiTeacher.GUIApplication;

public class MainGUI extends GUIApplication {
 
    public static Test80 a;
    public MainGUI(int width, int height) {
        super(width, height);
        setVisible(true);
    }
 
    @Override
    public void initScreen() {
        a = new Test80(getWidth(), getHeight());
        setScreen(a);
    }
 
    public static void main(String[] args) {
        MainGUI gui = new MainGUI(500,500);
        Thread b = new Thread(gui);
        b.start();
    }
 
}
