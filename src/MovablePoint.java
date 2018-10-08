public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float spx, float spy){
        this.xSpeed = spx;
        this.ySpeed = spy;
    }

    public  float[] getSpeed(){
        return new float[]{this.xSpeed,this.ySpeed};
    }

    public MovablePoint move(){
        this.x+=this.xSpeed;
        this.y+=this.ySpeed;
        return this;
    }

    @Override
    public String toString(){
        return super.toString()+"speed = ["+this.xSpeed+","+this.ySpeed+"]";
    }
}
