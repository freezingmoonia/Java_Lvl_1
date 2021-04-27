public class Lesson_5 {

    public static void main(String[] args) {
        //3 Задание
        Staff user_01 = new Staff("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 89193218127l, 30000, 30);
        System.out.println(user_01.info());
        //4 задание
        Staff[] staffArray = new Staff[5];
        staffArray[0] = new Staff("Чума Петр", "Engineer", "ivi@mailbox.com", 89193215555l, 32000, 30);
        staffArray[1] = new Staff("Непейпиво Ваня", "Engineer", "van@mailbox.com", 89231231286l, 34000, 39);
        staffArray[2] = new Staff("Казявкин Семен", "Engineer", "dfan@mailbox.com", 89231281677l, 50000, 41);
        staffArray[3] = new Staff("Пупкин Вася", "Engineer", "iris@mailbox.com", 89231991277l, 49000, 55);
        staffArray[4] = new Staff("Грызидуб Леша", "Engineer", "gryzidub@mailbox.com", 89235871277l, 63000, 25);
        //5 задание
        for (int i = 0; i < staffArray.length; i++) {
            if (staffArray[i].age > 40)
                System.out.println(staffArray[i].info() + "\n");
            else {}
        }
    }
}
