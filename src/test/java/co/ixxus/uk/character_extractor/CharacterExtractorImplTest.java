package co.ixxus.uk.character_extractor;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Unit test for simple App.
 */
public class CharacterExtractorImplTest {
    private CharacterExtractor characterExtractor;
    private String inputString;

    @Before
    public void setUp() throws Exception {
        characterExtractor = new CharacterExtractorImpl();
    }

    @Test
    public void checkCharacterExtractorIsCreated() {
        assertThat(characterExtractor).isNotNull();
    }

    @Test
    public void checkInputStringIsNotEmpty() {
        assertThat(inputString).isNotNull();
    }

    @Test
    public void checkInputStringHasElements() {
        assertThat(inputString.length()).isGreaterThan(0);
    }

    @Test
    public void checkCharacterExtractorElementsAreNotDuplicated() {
        inputString = "aaabbbcccrrrbacrrcarb";
        char[] outputStream = characterExtractor.extract(inputString);
        StringBuilder result = new StringBuilder();

        assertThat(outputStream.length).isEqualTo(4);
        for (int i=0; i<outputStream.length; i++) {
            String element = String.valueOf(outputStream[i]);
            assertThat(result).doesNotContain(element);
            result.append(element);
        }
    }
}

