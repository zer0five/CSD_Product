package edu.fpt.se1603.group6;

public interface Serializer<T> {
    boolean serialize(T t);

    T deserialize();
}
