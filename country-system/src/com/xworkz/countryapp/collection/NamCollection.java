package com.xworkz.countryapp.collection;

import com.xworkz.countryapp.streams.NamStream;
import com.xworkz.countryapp.streams.NamStreamImpl;

import java.util.Collection;
import java.util.List;

public interface NamCollection<T> extends Collection<T>, List<T> {
   default NamStream<T> namStream(){
       return new NamStreamImpl<>();
   }
}
