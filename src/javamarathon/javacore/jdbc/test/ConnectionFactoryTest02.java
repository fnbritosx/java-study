package javamarathon.javacore.jdbc.test;

import javamarathon.javacore.jdbc.domain.Producer;
import javamarathon.javacore.jdbc.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().id(1).name("Meno Bom").build();
        ProducerServiceRowSet.updateCachedRowSet(producer);

        log.info("-------------");

        List<Producer> producers = ProducerServiceRowSet.findByNameJdbcRowSet("");
        log.info(producers);
    }
}

