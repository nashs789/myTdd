package com.tdd.myTdd.PracticalUnitTest.ch01.test;

import com.tdd.myTdd.PracticalUnitTest.ch01.ScoreCollection;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScoreCollectionTest {

    @Test
    void 숫자_두_개_더해서_평균_구하기() {
        // given
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        // when
        int res = collection.arithmeticMean();

        // then
        assertThat(res).isEqualTo(6);
    }
}
