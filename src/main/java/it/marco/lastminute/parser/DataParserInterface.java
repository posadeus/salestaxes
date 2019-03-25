package it.marco.lastminute.parser;

public interface DataParserInterface<T> {

	T parse(String[] line);
}
