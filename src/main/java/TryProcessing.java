import processing.core.PApplet;

public class TryProcessing extends PApplet{
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int x1,x2,x3,x4=0;

    public static void main(String[] args){
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings(){
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void draw(){
        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();
    }

    private void drawCircle1() {
        ellipse(x1,HEIGHT/5, DIAMETER, DIAMETER);
//      frameRate(60);
        x1+=1;
    }

    private void drawCircle2() {
        ellipse(x2,(2*HEIGHT)/5, DIAMETER, DIAMETER);
//      frameRate(120);
        x2+=2;
    }

    private void drawCircle3() {
        ellipse(x3,(3*HEIGHT)/5, DIAMETER, DIAMETER);
//      frameRate(180);
        x3+=3;
    }

    private void drawCircle4() {
        ellipse(x4,(4*HEIGHT)/5, DIAMETER, DIAMETER);
//      frameRate(240);
        x4+=4;
    }
}
