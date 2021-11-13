
public class HomeWork5 {

    public static void main(String[] args) {

        Worker[] personArray = new Worker[5];
        personArray[0] = new Worker("Петрова Элэонора Валентиновна","Министр", "deuvoyibrapeu-9901@yopmail.com", "+7 911 211 42 65", 949410, 34);
        personArray[1] = new Worker("Шахуро Ладимир Викторович","Моторист", "serajovaque-7075@yopmail.com", "+7 928 522 69 43", 256823, 43);
        personArray[2] = new Worker("Дроздова Неонила Вячеславовна","Токсиколог", "leuwalaugeicra-6781@yopmail.com", "+7 905 819 61 84", 482590, 59);
        personArray[3] = new Worker("Савельев Соломон Станиславович","Изобретатель", "xajouhifouna-8597@yopmail.com", "+7 911 462 93 86", 786723, 48);
        personArray[4] = new Worker("Сысолятина Алевтина Семеновна","Менеджер по туризму","reifreninnafa-3021@yopmail.com", "+7 942 752 71 13",355010, 27);

        for (int i = 0; i < personArray.length; i++) {
            if (personArray[i].age >= 40) personArray[i].information();
        }
    }

}
