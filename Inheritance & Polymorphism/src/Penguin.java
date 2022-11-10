public class Penguin extends Bird {
    int moveSpeed;
    
    public Penguin () {
        moveSpeed = 2;
    }
    
    public void move () {
        x_coord += moveSpeed;
        y_coord += moveSpeed;
        System.out.println("1:Penguin is waddle at speed " + moveSpeed +". x=" + x_coord + ",y=" + y_coord);
        System.out.println("2:Penguin is waddle at speed " + super.moveSpeed +". x=" + x_coord + ",y=" + y_coord);
    }
    
}