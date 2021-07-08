package com.codersbay;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codersbay.Main.checkEmailString;
import static org.junit.jupiter.api.Assertions.*;

public class EmailCheckerTest {

    @Test
    @DisplayName("when null is handed over, a null pointer exception will be thrown")
    public void testNull() {
        assertThrows(NullPointerException.class, () -> checkEmailString(null));
    }

    @Test
    @DisplayName("When an empty string is handed over, an IllegalArgumentException will be thrown")
    public void testEmptyString() {
        assertThrows(IllegalArgumentException.class, () -> checkEmailString(""));
    }

    @Test
    @DisplayName("When a special character is used, the check returns 'false'")
    public void testSpecialSigns() {
        assertFalse(checkEmailString("%&$§almostworks@bubu.com"));
    }

    @Test
    @DisplayName("When there is an uppercase letter in the global domain, return 'false'")
    public void testUppercaseGlobalDomain() {
        assertFalse(checkEmailString("DefinitelyAlmost@valid.Email"));
    }

    @Test
    @DisplayName("When an underscore is used before the @ it is valid, after it, it returns 'false'")
    public void testUnderscoreCorrect() {
        assertEquals(true, checkEmailString("Works_before@doesntafter.com"));
    }

    @Test
    @DisplayName("When an underscore is used before the @ it is valid, after it, it returns 'false'")
    public void testUnderscoreFalse() {
        assertFalse(checkEmailString("Worksbefore@doesnt_after.com"));
    }

    @Test
    @DisplayName("When the global domain has less than 1 character it returns 'false'")
    public void testTooFewGlobalDomainLetters() {
        assertFalse(checkEmailString("this_aint@gonnawor.k"));
    }

    @Test
    @DisplayName("When the global domain has more than 6 characters it returns 'false'")
    public void testTooManyGlobalDomainLetters() {
        assertFalse(checkEmailString("almost@worked.ISmelledIt"));
    }

    @Test
    @DisplayName("When less than 5 letters are used before the @, it returns 'false'")
    public void testTooFewLettersInFront() {
        assertFalse(checkEmailString("bubu@nono.com"));
    }

    @Test
    @DisplayName("When missing a spidermonkey sign, 'false' is returned")
    public void testWithoutSpiderMonkey() {
        assertFalse(checkEmailString("We.are.missing.something.com"));
    }

    @Test
    @DisplayName("When there are whitespaces in front of the email, it returns 'false'")
    public void testWhiteSpaceFront() {
        assertFalse(checkEmailString(" totallyValid@email.sir"));
    }

    @Test
    @DisplayName("When there are Whitespaces in the back, it returns 'false'")
    public void testWhiteSpaceBack() {
        assertFalse(checkEmailString("almostTotallyValid@email.mam "));
    }
}
