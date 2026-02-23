package javamarathon.javacore.jdbc.test;

import javamarathon.javacore.jdbc.domain.Producer;
import javamarathon.javacore.jdbc.repository.ProducerRepository;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
//        Producer producer = Producer.builder().name("Reki Kawahara").build();
//        ProducerRepository.save(producer);

        ProducerRepository.delete(5);
    }
}
