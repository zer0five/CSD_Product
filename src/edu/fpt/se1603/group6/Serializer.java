package edu.fpt.se1603.group6;

/**
 * interface Serializer
 *
 * @author Giang Trương Gia Lạc
 * @param <T> the type of the object to be serialized
 */
public interface Serializer<T> {

    /**
     * Serialize the object to the file
     *
     * @author Giang Trương Gia Lạc
     * @param t the object to be serialized
     * @return true if the serialization is successful
     */
    boolean serialize(T t);

    /**
     * Deserialize the object from the file
     *
     * @author Giang Trương Gia Lạc
     * @return the object after deserialization
     */
    T deserialize();

}
