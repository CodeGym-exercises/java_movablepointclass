public class Point {
    protected float x;
    protected float y;

    public Point(){
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] fl = new float[2];
        fl[0] = this.x;
        fl[1] = this.y;
        return fl;
    }
    @Override
    public String toString(){
        return "["+this.x+","+this.y+"]";
    }
}
