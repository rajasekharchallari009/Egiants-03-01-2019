package main.java.com.egiantsprojects.practice.interfaces.functional;

@FunctionalInterface
public interface Converter<F, T> {

    T convert(F from);
}
