package PhoneProject;

public class SamsongPhone extends Phone {
    User user;

    public SamsongPhone(User user) {
        this.user = user;
        phoneCompany = PhoneCompany.SAMSONG;
    }

    public void turnOnPhone() {
        StringBuilder sb = new StringBuilder();
        sb.append(user.getUserName()).append("님이 ").append(getPhoneCompany().getPhoneCompanyName()).append("을 켰습니다.");
        System.out.println(sb);
    }

    public void printPhoneState() {
        System.out.println("★★★ 폰 켜지는 중 ★★★");
    }
}
