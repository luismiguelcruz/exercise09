/**
 * All rights reserved.
 * Copyright (c) Ixxus Ltd 2016
 */
package co.ixxus.uk.character_extractor;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Luis Miguel Cruz
 *
 */
public class CharacterExtractorImpl implements CharacterExtractor {

    /*
     * (non-Javadoc)
     *
     * @see
     * co.ixxus.uk.character_extractor.CharacterExtractor#extract(java.lang.
     * String)
     */
    public char[] extract(final String text) {
        if (StringUtils.isNotEmpty(text)) {
            return convertSet(removeDuplicates(text));
        } else {
            return new char[0];
        }
    }

    private SortedSet<Character> removeDuplicates(final String text) {
        final SortedSet<Character> set = new TreeSet<Character>();

        for (int i = 0; i < text.length(); i++) {
            set.add(new Character(text.charAt(i)));
        }

        return set;
    }

    private char[] convertSet(final Set<Character> set) {
        final StringBuilder stringBuilder = new StringBuilder();

        for (final Character i : set) {
            stringBuilder.append(i);
        }

        return stringBuilder.toString().toCharArray();
    }

}
