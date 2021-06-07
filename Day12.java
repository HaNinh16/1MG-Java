import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Java6Assertions.in;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class Day12 {
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
