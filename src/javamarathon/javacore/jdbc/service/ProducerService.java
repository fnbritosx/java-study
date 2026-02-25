package javamarathon.javacore.jdbc.service;

import javamarathon.javacore.jdbc.domain.Producer;
import javamarathon.javacore.jdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {
    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }

    public static void delete(int... ids) {
        for (int id : ids) {
            if (id <= 0) {
                throw new IllegalArgumentException("Invalid value for id.");
            }
        }

        ProducerRepository.delete(ids);
    }

    public static void update(Producer producer) {
        if (producer.getId() == 0 || producer.getId() <= 0) {
            throw new IllegalArgumentException("Invalid value for id.");
        }

        ProducerRepository.update(producer);
    }

    public static List<Producer> findAll() {
        return ProducerRepository.findAll();
    }

    public static List<Producer> findByName(String name) {
        return ProducerRepository.findByName(name);
    }

    public static void showProducerMetadata() {
        ProducerRepository.showProducerMetadata();
    }

}
