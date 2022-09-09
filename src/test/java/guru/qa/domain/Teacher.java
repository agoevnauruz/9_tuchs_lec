package guru.qa.domain;

public class Teacher {

    private String name;
    private Boolean IsGoodTeacher;
    private Integer age;
    private Passport passport;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isGoodTeacher() {
        return IsGoodTeacher;
    }

    public void setGoodTeacher(Boolean goodTeacher) {
        IsGoodTeacher = goodTeacher;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public static class Passport{
        public Integer getNumber() {
            return number;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }

          private Integer number;

    }
}
