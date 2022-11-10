
public class Bird extends Animal {
    int moveSpeed;
    
    public Bird () {
        moveSpeed = 10;
    }
    
    public void move () {
        x_coord += moveSpeed;
        y_coord += moveSpeed;
        System.out.println("1:Bird is flying at speed " + moveSpeed +". x=" + x_coord + ",y=" + y_coord);
        System.out.println("2:Bird is flying at speed " + super.moveSpeed +". x=" + x_coord + ",y=" + y_coord);
    }
}
