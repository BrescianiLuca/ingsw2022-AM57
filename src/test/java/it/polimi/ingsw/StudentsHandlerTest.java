package it.polimi.ingsw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//testati due metodi add, da finire
class StudentsHandlerTest {
    //Test of constructor and add function
    @Test
    void add() {
        StudentsHandler stud2 = new StudentsHandler();
        StudentsHandler stud1 = new StudentsHandler(10);

        for(int i=0; i<100;i++) {
            for (Color color : Color.values()) {
                stud1.add(color);
                assertEquals(i<10?i+1:10, stud1.numStudents(color));
            }
        }

        for(int i=0; i<100;i++) {
            for (Color color : Color.values()) {
                stud2.add(color);
                assertEquals(i<25?i+1:26, stud2.numStudents(color));
            }
        }
    }
    //test parameter add with the same two constructors
    @Test
    void numAdd() {
        StudentsHandler stud1 = new StudentsHandler();
        int num = 10;
        int num1 = -1;
        int num2 = 40;
        StudentsHandler stud2 = new StudentsHandler();
        for (Color color :
                Color.values()) {
                stud2.add(color, num);
                assertEquals(10, stud2.numStudents(color));
                assertThrowsExactly(IllegalArgumentException.class, () -> stud2.add(color, num1));
                stud2.add(color, num2);
                assertEquals(26, stud2.numStudents(color));
        }

    }

    @Test
    void remove() {
        StudentsHandler stud1 = new StudentsHandler(10);
        StudentsHandler stud2 = new StudentsHandler();

        for (Color color:  Color.values()) {
            stud1.add(color, 20);
            stud2.add(color, 10);
        }
        for(int i=0; i<100;i++) {
            for (Color color :
                    Color.values()) {
                stud1.remove(color);
                assertEquals(i<10?9-i:0, stud1.numStudents(color));

                stud2.remove(color);
                assertEquals(i<10?9-i:0, stud2.numStudents(color));
            }
        }



    }

    @Test
    void testRemove() {
        StudentsHandler stud1 = new StudentsHandler();
        int num = 10;
        int num1 = -1;
        int num2 = 40;
        StudentsHandler stud2 = new StudentsHandler(20);
        for (Color color :
                Color.values()) {
            stud2.add(color,20);
            stud2.remove(color, num);
            assertEquals(10, stud2.numStudents(color));
            assertThrowsExactly(IllegalArgumentException.class, () -> stud2.remove(color, num1));
            stud2.remove(color, num2);
            assertEquals(0, stud2.numStudents(color));
        }
    }

    @Test
    void numStudents() {
    }

    @Test
    void testNumStudents() {
    }
}