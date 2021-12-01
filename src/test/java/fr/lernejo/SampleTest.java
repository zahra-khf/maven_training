package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {
    private Sample sample = new Sample();
    @Test
    void test_add(){
        int test = sample.op(Sample.Operation.ADD,2,2);
        Assertions.assertThat(test).as("adding 2 +2 ")
            .isEqualTo(4);
    }

    @Test
    void test_fact(){
        int test =sample.fact(4);
        Assertions.assertThat(test).as("factorial of 4 ")
            .isEqualTo(24);

    }@Test
    void test_sign() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> sample.fact(-3))
            .withMessage("N should be positive");
    }



}
