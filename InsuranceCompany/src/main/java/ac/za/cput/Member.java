package ac.za.cput;

import java.time.LocalDate;
import java.util.Objects;

public class Member {

    private String memberId;
    private String name;
    private LocalDate dateOfBirth;
    private String phoneNumber;
    private String adress;
    private LocalDate dateJoined;


    public Member(Builder builder) {
        this.memberId = builder.memberId;
        this.name = builder.name;
        this.dateOfBirth = builder.dateOfBirth;
        this.phoneNumber = builder.phoneNumber;
        this.adress = builder.adress;
        this.dateJoined = builder.dateJoined;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public LocalDate getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(LocalDate dateJoined) {
        this.dateJoined = dateJoined;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", adress='" + adress + '\'' +
                ", dateJoined=" + dateJoined +
                '}';
    }

    public static class Builder{
        private String memberId;
        private String name;
        private LocalDate dateOfBirth;
        private String phoneNumber;
        private String adress;
        private LocalDate dateJoined;

        public Builder setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setAdress(String adress) {
            this.adress = adress;
            return this;
        }

        public Builder setDateJoined(LocalDate dateJoined) {
            this.dateJoined = dateJoined;
            return this;

        }

        public Member build() {
            return new Member(this);
        }

    }
    // This code overrides the equals operation to define how equality is determined for the members class
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(memberId, member.memberId) &&
                Objects.equals(name, member.name) &&
                Objects.equals(dateOfBirth, member.dateOfBirth) &&
                Objects.equals(phoneNumber, member.phoneNumber) &&
                Objects.equals(adress, member.adress) &&
                Objects.equals(dateJoined, member.dateJoined);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, name, dateOfBirth, phoneNumber, adress, dateJoined);
    };



}
