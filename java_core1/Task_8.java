package java_core1;

interface Action{

    void run();
    void jump();
    int getHeight();

    int getDistance();

}
class Cat_3 implements Action{

    private String name;
    private int jumpHeight;
    private int runDistance;

    public Cat_3(String name, int jumpHeight, int runDistance){
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    public String getName() {
        return name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getRunDistance() {
        return runDistance;
    }

    @Override
    public void run() {
        System.out.println("Кот пробежал: " + getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Кот подпрыгнул: " + getJumpHeight());
    }

    @Override
    public int getHeight() {
        return this.jumpHeight;
    }

    @Override
    public int getDistance() {
        return this.runDistance;
    }

}
class Robot implements Action{

    private String name;
    private int jumpHeight;
    private int runDistance;

    public Robot(String name, int jumpHeight, int runDistance){
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    public String getName() {
        return name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }


    @Override
    public void run() {
        System.out.println("Робот пробежал: " + getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Робот подпрыгнул: " + getJumpHeight());
    }

    @Override
    public int getHeight() {
        return this.jumpHeight;
    }

    @Override
    public int getDistance() {
        return this.runDistance;
    }

}
class Person implements Action{

    private String name;
    private int jumpHeight;
    private int runDistance;
    public Person(String name, int jumpHeight, int runDistance){
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public int getRunDistance() {
        return runDistance;
    }

    @Override
    public void run() {
        System.out.println("Человек пробежал: " + getRunDistance() + "метров");
    }

    @Override
    public void jump() {
        System.out.println("Человек подпрыгнул: " + getJumpHeight() + "сантиметров");
    }

    @Override
    public int getHeight() {
        return this.runDistance;
    }

    @Override
    public int getDistance() {
        return this.jumpHeight;
    }

}
abstract class Barrier {

    private String name;
    public Barrier(String name){
        this.name = name;
    }

    public abstract boolean doAction(Action action);

    public String getName(){
        return name;
        }

}
class Treadmill extends Barrier {

    private int distance;
    public Treadmill(String name, int distance){
        super(name);
        this.distance = distance;
    }

    public int getDistance(){
        return distance;
    }

    @Override
    public boolean doAction(Action action) {
        System.out.println("Беговая дорожка " + super.getName() + " длинной: " + getDistance());

        action.run();

        if(getDistance() < action.getDistance()){
            System.out.println("Бег выполнен успешно");
            return true;
        }else{
            System.out.println("Не удалось пробежать заданную дистанцию");
            return false;
        }
    }

}
class Wall extends Barrier{

    private int height;
    public Wall(String name, int height){
        super(name);

        this.height = height;
    }

    public int getHeight(){
        return height;
    }

    @Override
    public boolean doAction(Action action) {
        System.out.println("Стена " + super.getName() + " высотой : " + getHeight());

        action.jump();

        if(getHeight() < action.getHeight()){
            System.out.println("Прыжок выполнен успешно");
            return true;
        }else{
            System.out.println("Не удалось перепрыгнуть стену");
            return false;
        }
    }
}
public class Task_8 {
    public static void main(String[] args) {
        Object[] objs = new Object[3];
        objs[0] = new Cat_3("Барсик",100,700);
        objs[1] = new Robot("0101",0,300);
        objs[2] = new Person("Michel",45,1500);
        Barrier[] barriers = new Barrier[2];
        barriers[0] = new Wall("Wall",40);
        barriers[1] = new Treadmill("Treadmill",500);
        for (int i = 0; i < objs.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {
                result = barriers[j].doAction((Action) objs[i]);
                if (!result) {
                    break;
                }
            }
            if (result) {
                System.out.println("Success!!");
            } else {
                System.out.println("unsuccessfully!!");
            }
        }
    }
}
