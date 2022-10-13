package java_core1;

public class Task_6 {
    public static void main(String[] args) {
        Cat_2[] cat = new Cat_2[3];
        cat[0] = new Cat_2("Barsik",10);
        cat[1] = new Cat_2("Vaska",15);
        cat[2] = new Cat_2("Borya",25);
        Plate plate = new Plate(40);
        plate.plateInfo();
        plate.addFood(20);
        for (int i = 0; i < cat.length; i++) {
            if(cat[i].isFull(plate) == true){
                cat[i].getName();
                cat[i].eat(plate);
            }
        }
        plate.plateInfo();
    }
}

class Plate{
    private int food;

    public Plate(int food){
        this.food = food;
    }

    public void decreaseFood(int n){
        if(food < 0){
            System.out.println("Value of food can not be negative");
        }
        if(food >= n){
            food -= n;
        }
    }

    public void addFood(int n){
        food += n;
    }
    public int getFood() {
        return food;
    }

    public void plateInfo(){
        System.out.println("Plate: " + food);
    }
}

class Cat_2{
    private String name;
    private int appetite;

    public Cat_2(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p){
        p.decreaseFood(appetite);
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public boolean isFull(Plate plate){
        if((plate.getFood() - appetite) >= 0) {
            System.out.println("Animal is full");
            return true;
        }
        return false;
    }
}
