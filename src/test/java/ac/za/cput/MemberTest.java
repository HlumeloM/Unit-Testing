package ac.za.cput;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class MemberTest {

    //Test's the equality of 2 member objects
    @Test
    public void testEquality() {

        LocalDate dateOfBirth = LocalDate.of(1990, 5, 15);
        LocalDate dateJoined = LocalDate.of(2020, 3, 1);

        Member member1 = new Member.Builder()
                .setMemberId("1234")
                .setName("Hlumelo Matsha")
                .setDateOfBirth(dateOfBirth)
                .setPhoneNumber("1234567890")
                .setAdress("123 Main St")
                .setDateJoined(dateJoined)
                .build();

        Member member2 = new Member.Builder()
                .setMemberId("1234")
                .setName("Hlumelo Matsha")
                .setDateOfBirth(dateOfBirth)
                .setPhoneNumber("1234567890")
                .setAdress("123 Main St")
                .setDateJoined(dateJoined)
                .build();

        assertEquals(member1, member2);
    };



};