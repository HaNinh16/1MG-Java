import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Java6Assertions.in;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class TestTestTest {

    @Test
    public void Check() {
        assertEquals(5, TestTest.Sum(3, 2));
        assertNotEquals(5, TestTest.Sum(3, 3));
        assertTrue(8 > TestTest.Sum(2, 3), "8 > Tổng 2 & 3");
        assertFalse(2 > TestTest.Sum(3, 1), "2 > Tổng 2 & 3");
    }

    @Test
    public void checkArry() {
        int[] Arry1 = new int[]{0, 2, 4, 6, 8};
        int[] Arry2 = new int[]{0, 2, 4, 6, 8};
        assertArrayEquals(Arry1, Arry2, "Hai mảng bằng nhau");

    }

    @Test
    public void checkSame() {
        String chuoi1 = "Check1";
        String chuoi2 = "Check2";
        String chuoi3 = "Check1";
        assertSame(chuoi1, chuoi3, "The same");
        assertNotSame(chuoi1, chuoi2, "Not same");
    }

    @Test
    public void CheckNull() {
        Object Check = new Object();
        assertNull(Check, null, "Null");
    }

    private void assertNull(Object Check, Object o, String Null) {
    }

    @Test
    public void CheckNotNull() {
        Object Checknull = new Object();
        assertNotNull(Checknull, null, "Not null");
    }

    private void assertNotNull(Object checknull, Object o, String not_null) {
    }


    @Test
    @DisplayName("Bài 1: Check email")
    public void CheckMail() {
        String email = "haninh16@gmail.com";
        assertThat(email).isNotEmpty()
                .containsPattern("^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$");

    }

    @Test
    @DisplayName("Bài 2: Check cân nặng")
    public void CheckWeight(){
        double intWeght = 2.0;
        assertThat(intWeght).isNotZero()
                .isBetween(1.0,300.0);
    }

    @Test
    @DisplayName("Bài 3 : Check số CMND")
    public void CheckCMND(){
        String[] CMND = new String[]{"123456789","223456789"};
        for (String dem: CMND){
            assertThat(dem).isNotEmpty()
                    .containsOnlyDigits()
                    .hasSize(9);
        }

    }

}