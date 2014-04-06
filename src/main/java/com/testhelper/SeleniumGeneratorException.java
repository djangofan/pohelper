package com.testhelper;

/**
 * An exception type to identify error conditions specific to the page object helper/generator.
 * User: pgrandje
 * Date: 5/5/12
 */
public class SeleniumGeneratorException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	SeleniumGeneratorException(String message) {
        super(message);
    }

}
