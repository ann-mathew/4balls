import processing.core.PApplet;

public class TryProcessingOOP extends PApplet{
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    private Ball[] balls = new Ball[4];

    TryProcessingOOP(){
        balls[0]=new Ball(HEIGHT/5,1);
        balls[1]=new Ball((2*HEIGHT)/5,2);
        balls[2]=new Ball((3*HEIGHT)/5,3);
        balls[3]=new Ball((4*HEIGHT)/5,4);
    }

    public static void main(String[] args){
        PApplet.main("TryProcessingOOP",args);
    }

    @Override
    public void settings(){
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void draw(){
        drawBalls();
        newXPosition();
    }

    private void newXPosition(){
        for(Ball ball: balls){
            int newX=ball.getxPos()+ball.getSpeed();
            ball.setxPos(newX);
        }
    }

    private void drawBalls() {
        for(Ball ball: balls){
            ellipse(ball.getxPos(),ball.getyPos(), DIAMETER, DIAMETER);
        }
    }
}