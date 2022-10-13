package java_core1;

public abstract class Task_5 {

    abstract void run(int runDistanceLength);
    abstract void swim(int swimDistanceLength);
}

class Dog extends Task_5{

    private String name;
    private final int runDistance = 500;
    private final int swimDistance = 10;

    public Dog(String name){
        this.name = name;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getSwimDistance(){
        return swimDistance;
    }

    @Override
    void run(int runDistanceLength){
        if(runDistanceLength < 0){
            System.out.println("Wrong value of distance length");
        }else if(runDistanceLength <= getRunDistance()){
            System.out.println(name + " ran " + runDistanceLength + " metres");
        }else{
            System.out.println(name + " can not run " + runDistanceLength + " metres");
        }
    }

    @Override
    void swim(int swimDistanceLength){
        if(swimDistanceLength < 0){
            System.out.println("Wrong value of distance length");
        }else if(swimDistanceLength <= getSwimDistance()){
            System.out.println(name + " swam " + swimDistanceLength + " metres");
        }else{
            System.out.println(name + " can not swim " + swimDistanceLength + " metres");
        }

    }
}

class Cat_1 extends Task_5{

    private String name;
    private final int runDistance = 200;

    public Cat_1(String name){
        this.name = name;
    }

    public int getRunDistance(){
        return runDistance;
    }

    @Override
    void run(int runDistanceLength){
        if(runDistanceLength < 0){
            System.out.println("Wrong value of distance length");
        }else if(runDistanceLength <= getRunDistance()){
            System.out.println(name + " ran " + runDistanceLength + " metres");
        }else{
            System.out.println(name + " can not run " + runDistanceLength + " metres");
        }
    }

    @Override
    void swim(int swimDistanceLength){
        if(swimDistanceLength < 0){
            System.out.println("Wrong value of distance length");
        }else{
            System.out.println("Cat can not swim");
        }
    }
}

class Main_for_animal_task{
    public static void main(String[] args) {
        Cat_1[] cat = new Cat_1[3];
        Dog[] dog = new Dog[3];
        cat[0] = new Cat_1("Boris");
        cat[1] = new Cat_1("Ivan");
        cat[2] = new Cat_1("Kesha");
        dog[0] = new Dog("Bobik");
        dog[1] = new Dog("Slavik");
        dog[2] = new Dog("Valera");
        System.out.println("Cats count: " +cat.length);
        System.out.println("Dogs count: " + dog.length);
        dog[0].run(501);
        dog[1].run(480);
        dog[2].run(-100);
        cat[0].run(201);
        cat[1].run(150);
        cat[2].run(-1);
        dog[0].swim(501);
        dog[1].swim(9);
        dog[2].swim(-100);
        cat[0].swim(201);
        cat[1].swim(0);
        cat[2].swim(-1);
    }
}