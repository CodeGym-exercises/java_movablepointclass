public class main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(200,300,3,2);

        System.out.println(movablePoint.toString());
        movablePoint = movablePoint.move();
        System.out.println(movablePoint.toString());
    }
}
