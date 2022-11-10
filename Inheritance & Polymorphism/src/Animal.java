
import java.util.ArrayList;

public class Animal {
    int x_coord;
    int y_coord;
    int moveSpeed;
    
    public Animal() {
        x_coord = 0;
        y_coord = 0;
        moveSpeed = 1;
        
    }
    
    public void move() {
        x_coord += moveSpeed;
        y_coord += moveSpeed;
        System.out.println("Animal is walking at speed " + moveSpeed +". x=" + x_coord + ",y=" + y_coord);
    }

	public static void main (String args[]) {
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		
		Animal a1 = new Animal();
		Animal a2 = new Fish();
		Animal a3 = new Frog();
		Animal a4 = new Bird();
		Animal a5 = new Penguin();
		
		animalList.add(a1);
		animalList.add(a2);
		animalList.add(a3);
		animalList.add(a4);
		animalList.add(a5);
		
		int loop = 10;
		while (loop > 0) {
			for(int i = 0; i < animalList.size(); i++) {
				animalList.get(i).move();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			--loop;
		}
	}

}
