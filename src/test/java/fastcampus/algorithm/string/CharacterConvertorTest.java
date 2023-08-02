package fastcampus.algorithm.string;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;



class CharacterConvertorTest {

    CharacterConvertor characterConvertor;

    @BeforeEach
    void setUp() {
        characterConvertor = new CharacterConvertor();
    }

    @DisplayName("대/소문자 판단 함수")
    @Test
    void test_convertBigSmall() {
        assertEquals('a', characterConvertor.convertBigSmall('A'));
        assertEquals('A', characterConvertor.convertBigSmall('a'));
        assertEquals('1', characterConvertor.convertBigSmall('1'));
        assertEquals('.', characterConvertor.convertBigSmall('.'));
        assertEquals('<', characterConvertor.convertBigSmall('<'));
        assertEquals('ㄱ', characterConvertor.convertBigSmall('ㄱ'));
    }

    @DisplayName("문자열 대/소문자 변환 함수")
    @Test
    void test_convertBigSmallString() {
        assertEquals("abcd", characterConvertor.convertBigSmallString("ABCD"));
        assertEquals("aBcD", characterConvertor.convertBigSmallString("AbCd"));
        assertEquals("a!BcD0", characterConvertor.convertBigSmallString("A!bCd0"));
    }


}