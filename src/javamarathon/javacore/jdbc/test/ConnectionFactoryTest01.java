package javamarathon.javacore.jdbc.test;

import javamarathon.javacore.jdbc.domain.Producer;
import javamarathon.javacore.jdbc.repository.ProducerRepository;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer autor = new Producer.ProducerBuilder()
                .name("Hajime Isayama")
                .build();
        ProducerRepository.save(autor);
    }
}
