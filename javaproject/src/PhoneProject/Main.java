package PhoneProject;

public class Main {
    public static void main(String[] args) {
        PhoneShop phoneShop = new PhoneShop();

        User user1 = new User("잡th");
        Phone samsongPhone = new SamsongPhone(user1);
        phoneShop.buyPhone(user1,samsongPhone);
        samsongPhone.turnOnPhone();
        samsongPhone.printPhoneState();

        System.out.println();

        User user2 = new User("거니");
        Phone applePhone = new ApplePhone(user2);
        phoneShop.buyPhone(user2,applePhone);
        applePhone.turnOnPhone();
        applePhone.printPhoneState();
    }
}
