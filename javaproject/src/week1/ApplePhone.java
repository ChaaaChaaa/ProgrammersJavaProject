package week1;

public class ApplePhone extends Phone implements PhoneInterface {
    User user;

    public ApplePhone(User user) {
        this.user = user;
        phoneCompany = PhoneCompany.APPLE;
    }

    public void turnOnPhone() {
        StringBuilder sb = new StringBuilder();
        sb.append(user.getUserName()).append("님이 ").append(getPhoneCompany().getPhoneCompanyName()).append("을 켰습니다.");
        System.out.println(sb);
    }

    public void printPhoneState() {
        System.out.println("@@@ 폰 켜지는 중 @@@");
    }
}
