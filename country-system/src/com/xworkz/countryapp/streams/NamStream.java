package com.xworkz.countryapp.streams;

import java.util.function.Predicate;
import java.util.stream.Stream;

public interface NamStream<T> extends Stream<T> {
    NamStream<T> filterMaadu(Predicate<T> var);
}
