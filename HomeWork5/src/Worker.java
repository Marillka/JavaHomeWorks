public class Worker {
    String fullName;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Worker(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void information() {
        System.out.printf("ФИО: %s\n Должность: %s\n Email: %s\n Телефон: %s\n Зарплата: %d\n Возраст: %d",
                fullName,
                position,
                email,
                phone,
                salary,
                age);

        System.out.println();
        System.out.println();
    }

}

