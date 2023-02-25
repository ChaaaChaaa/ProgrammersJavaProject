package week1;

public class PhoneShop {
//    public week1.Phone buyPhone() {
//        return new week1.Phone();
//    }


    public Phone buyPhone(User user, Phone phone) {
        StringBuilder sb = new StringBuilder();
        if (phone.phoneCompany.equals(PhoneCompany.SAMSONG)) {
            sb.append(user.getUserName()).append("님이 ").append(PhoneCompany.SAMSONG.getPhoneCompanyName()).append("을 샀습니다.");
            System.out.println(sb);
            return new SamsongPhone(user);
        } else if (phone.phoneCompany.equals(PhoneCompany.APPLE)) {
            sb.append(user.getUserName()).append("님이 ").append(PhoneCompany.APPLE.getPhoneCompanyName()).append("을 샀습니다.");
            System.out.println(sb);
            return new ApplePhone(user);
        }
        return null;
    }
}

/*
원래 상속은 최대한 피하기 위해 samsongPhone과 applePhone에다가

public class SamsongPhoneimplements week1.PhoneInterface {
    week1.User user;
    week1.Phone phone;

    public week1.SamsongPhone(week1.User user, week1.Phone phone) {
        this.user = user;
        phone.phoneCompany = week1.PhoneCompany.SAMSONG;
    }
}

하고 Main에다가
     week1.SamsongPhone samsongPhone = new week1.SamsongPhone(user1,phoneShop.buyPhone());

하려고 하다가 의도가 상속을 쓰라는 의미인것같아서 바꿈
 */