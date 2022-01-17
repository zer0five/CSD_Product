package edu.fpt.se1603.group6;

/**
 * interface Serializer
 *
 * @param <T> the type of the object to be serialized
 * @author Giang Trương Gia Lạc - CE160766
 */
public interface Serializer<T> {

    /**
     * Serialize the object to the file
     *
     * @param t the object to be serialized
     * @return true if the serialization is successful
     * @author Giang Trương Gia Lạc - CE160766
     */
    boolean serialize(T t);

    /**
     * Deserialize the object from the file
     *
     * @return the object after deserialization
     * @author Giang Trương Gia Lạc - CE160766
     */
    T deserialize();

}
