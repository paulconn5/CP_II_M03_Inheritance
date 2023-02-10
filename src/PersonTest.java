import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p1;


    @BeforeEach
    void setUp() {
        p1 = new Person("John", "Smith", "000001", "Mr.", 2000);

    }

    @org.junit.jupiter.api.Test
    void setFirstName() {
        assertEquals("John Smith", p1.getFullName());
    }

    @org.junit.jupiter.api.Test
    void setFormalName() {
        assertEquals("Mr. John Smith", p1.getFormalName());
    }

    @org.junit.jupiter.api.Test
    void setAge() {
        assertEquals(23, p1.getAge());
    }
}
