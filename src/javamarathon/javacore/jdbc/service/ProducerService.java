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

    public static void showDbMetadata() {
        ProducerRepository.showDbMetadata();
    }

    public static void showTypeScrollWorking() {
        ProducerRepository.showTypeScrollWorking();
    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String name) {
        return ProducerRepository.findByNameAndUpdateToUpperCase(name);
    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String name) {
        return ProducerRepository.findByNameAndInsertWhenNotFound(name);
    }

    public static List<Producer> findByNamePrepareStatement(String name) {
        return ProducerRepository.findByNamePrepareStatement(name);
    }

    public static List<Producer> findByNameCallableStatement(String name) {
        return ProducerRepository.findByNameCallableStatement(name);
    }

    public static void findByNameAndDelete(String name) {
        ProducerRepository.findByNameAndDelete(name);
    }
}
