public class Ball {
    private int xPos;
    private final int yPos;
    private final int speed;

    Ball(int yPos, int speed){
        this.xPos=0;
        this.yPos=yPos;
        this.speed=speed;
    }

    public int getxPos(){
        return this.xPos;
    }

    public int getyPos(){
        return this.yPos;
    }

    public int getSpeed(){
        return this.speed;
    }

    public void setxPos(int xPos){
        this.xPos=xPos;
    }
}
