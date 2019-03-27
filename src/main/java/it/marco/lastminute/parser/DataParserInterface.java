package it.marco.lastminute.parser;

public interface DataParserInterface<T> {

	/**
	 * This method parses the content in the param into the T Object
	 *
	 * @param line	data to parse
	 *
	 * @return		Object with parsed elements
	 */
	T parse(String[] line);
}
