package PhoneProject;

public enum PhoneCompany {
    SAMSONG("삼송폰"), APPLE("사과폰");

    final String phoneCompanyName;

    PhoneCompany(String phoneCompanyName) {
        this.phoneCompanyName = phoneCompanyName;
    }

    public String getPhoneCompanyName() {
        return phoneCompanyName;
    }
}
