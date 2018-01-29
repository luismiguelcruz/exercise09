/**
 * All rights reserved.
 * Copyright (c) Ixxus Ltd 2016
 */
package co.ixxus.uk.character_extractor;

/**
 * @author Luis Miguel Cruz
 *
 */
public interface CharacterExtractor {
    /**
     * Returns an array with every character contained in the provided text, in
     * order of first occurrence, without duplication.
     * 
     * @param text
     *            The text whose characters are extracted.
     */
    char[] extract(String text);
}
