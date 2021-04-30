public class Staff {
    public String name;
    public String position;
    public String email;
    public long phone;
    public int solary;
    public int age;

    public Staff(String name, String position, String email, long phone, int solary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.solary = solary;
        this.age = age;
    }

    public String info() {
        return "ФИО: " + name + ";\n"
                + "Должность: " + position + ";\n"
                + "e-mail: " + email + ";\n"
                + "Телефон: " + phone+ ";\n"
                + "Зарплата: " + solary+ ";\n"
                + "Возраст: " + age;
        }
}
