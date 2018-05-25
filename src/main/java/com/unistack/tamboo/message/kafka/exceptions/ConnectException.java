package com.unistack.tamboo.message.kafka.exceptions;

/**
 * @author Gyges Zean
 * @date 2018/5/10
 * ConnectException is the top-level exception type generated by Kafka Runner implementations.
 */
public class ConnectException extends KafkaException {

    public ConnectException(String s) {
        super(s);
    }

    public ConnectException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public ConnectException(Throwable throwable) {
        super(throwable);
    }
}
