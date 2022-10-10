package java_core1;


public class Task_4
{
    private String name;
    private String surname;
    private String patronymic;
    private String position;
    private String email;
    private String phoneNum;
    private int age;
    private int salary;


    public Task_4()
    {

    }

    public Task_4(String name, String surname, String patronymic, String position, String email, String phoneNum, int age, int salary)
    {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phoneNum = phoneNum;
        this.age = age;
        this.salary = salary;

    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString(){
        String info = "Employee name: " + name
                + " Employee surname: " + surname
                + " Employee patronymic: " + patronymic
                + " Employee position: " + position +
                " Employee email: " + email +
                " Employee phone number: " + phoneNum +
                " Employee age: " + age +
                " Employee salary: " + salary;
        System.out.println(info);
        return info;

    }

}

class Main
{
    public static void main(String[] args) {
        Task_4[] employees = new Task_4[5];
        employees[0] = new Task_4("Nikita","Popov","Alexsandrovich","HR","nikita@mail.ru","8-924-123-43-22",25,100000);
        employees[1] = new Task_4("Alex","Zaichev","Petrovich","Developer","alex@mail.ru","8-924-123-43-22",42,400000);
        employees[2] = new Task_4("Slava","Petrov","Samsonovich","Designer","slava@mail.ru","8-924-123-43-22",21,150000);
        employees[3] = new Task_4("Petr","Slavnov","Nikitovich","Engineer","petr@mail.ru","8-924-123-43-22",45,200000);
        employees[4] = new Task_4("Ivan","Ivanov","Ivanovich","Scientist","ivan@mail.ru","8-924-123-43-22",41,300000);


        for (Task_4 employee:employees) {
            if(employee.getAge() > 40)
            {
                employee.toString();
            }
        }

        }
    }

