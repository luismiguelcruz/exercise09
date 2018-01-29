/**
 * All rights reserved.
 * Copyright (c) Ixxus Ltd 2016
 */
package co.ixxus.uk.character_extractor;

/**
 * @author Luis Miguel Cruz
 *
 */
public class main {
    public static void main(final String[] args) {
        final String input = "sdfsfksdfsdfsdfsdfsdfsdfsddfsdfsjdfhsdjfshkdfjshdkfjshfkdjfhkjh";
        final CharacterExtractor characterExtractor = new CharacterExtractorImpl();

        final char[] c = characterExtractor.extract(input);
        System.out.println(c);
    }
}
