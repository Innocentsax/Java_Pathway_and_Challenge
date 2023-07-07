package org.example.JUnit_Testing.Manager;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PContactManagerTest {
    PContactManager pContactManager;
    @BeforeAll
    public void setupAll(){
        System.out.println("Should Print All Test");
    }

    @BeforeEach
    public void setup(){
        PContactManager pContactManager = new PContactManager();
    }

    @Test
    public void shouldCreateContact(){
        PContactManager pContactManager = new PContactManager();
        pContactManager.addContact("Innocent", "Udo", "0348163093");
        Assertions.assertFalse(pContactManager.getAllContacts().isEmpty());
        Assertions.assertEquals(1, pContactManager.getAllContacts().size());

        Assertions.assertTrue(pContactManager.getAllContacts().stream()
                .anyMatch(pContact -> pContact.getFirstName().equals("Innocent") &&
                        pContact.getLastName().equals("Udo") &&
                        pContact.getPhoneNumber().equals("0348163093")));
    }

    @Test
    @DisplayName("Should Not create contact when First name is null")
    public void throwRuntimeExceptionWhenFirstNameIsNull(){
        Assertions.assertThrows(RuntimeException.class, () -> {
            pContactManager.addContact(null, "Udo", "0348163093");});
    }

    @Test
    @DisplayName("Should Not create contact when Last name is null")
    public void throwRuntimeExceptionWhenLastNameIsNull(){
        Assertions.assertThrows(RuntimeException.class, () -> {
            pContactManager.addContact("Innocent", null, "0348163093");});
    }

    @Test
    @DisplayName("Should Not create contact when Phone number is null")
    public void throwRuntimeExceptionWhenPhoneNumberIsNull(){
        Assertions.assertThrows(RuntimeException.class, () -> {
            pContactManager.addContact("Innocent", "Udo", null);});
    }

    @AfterEach
    public void tearDown(){
        System.out.println("Should Execute After Each Test");
    }

    @AfterAll
    public void tearDownAll(){
        System.out.println("Should be executed at the end of the Test");
    }

    @Test
    @DisplayName("Should Create Contact Only on MAC OS")
    @EnabledOnOs(value = OS.MAC, disabledReason = "Enabled only on MAC OS")
    public void shouldCreateContactOnlyOnMac(){
        PContactManager pContactManager = new PContactManager();
        pContactManager.addContact("Innocent", "Udo", "0348163093");
        Assertions.assertFalse(pContactManager.getAllContacts().isEmpty());
        Assertions.assertEquals(1, pContactManager.getAllContacts().size());

        Assertions.assertTrue(pContactManager.getAllContacts().stream()
                .anyMatch(pContact -> pContact.getFirstName().equals("Innocent") &&
                        pContact.getLastName().equals("Udo") &&
                        pContact.getPhoneNumber().equals("0348163093")));
    }

    @Test
    @DisplayName("Should Not Create Contact Only on Window OS")
    @DisabledOnOs(value = OS.WINDOWS, disabledReason = "Disabled on Window OS")
    public void shouldNotCreateContactOnlyOnWindows(){
        PContactManager pContactManager = new PContactManager();
        pContactManager.addContact("Innocent", "Udo", "0348163093");
        Assertions.assertFalse(pContactManager.getAllContacts().isEmpty());
        Assertions.assertEquals(1, pContactManager.getAllContacts().size());

        Assertions.assertTrue(pContactManager.getAllContacts().stream()
                .anyMatch(pContact -> pContact.getFirstName().equals("Innocent") &&
                        pContact.getLastName().equals("Udo") &&
                        pContact.getPhoneNumber().equals("0348163093")));
    }

    @Test
    public void shouldTestContactCreationOnDev() {
        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
        pContactManager.addContact("Innocent", "Udo", "0348163093");
        Assertions.assertFalse(pContactManager.getAllContacts().isEmpty());
        Assertions.assertEquals(1, pContactManager.getAllContacts().size());
    }

    @DisplayName("Repeat Contact Creation Test 5 Time")
    @RepeatedTest(value = 5, name = "Repeating Contact Creation Test {currentRepetition} of {totalRepetitions}")
    public void shouldTestContactCreationRepeatedly() {
        PContactManager pContactManager = new PContactManager();
        pContactManager.addContact("Innocent", "Udo", "0348163093");
        Assertions.assertFalse(pContactManager.getAllContacts().isEmpty());
        Assertions.assertEquals(1, pContactManager.getAllContacts().size());
    }
}