package javamarathon.javacore.jdbc.test;

import javamarathon.javacore.jdbc.domain.Producer;
import javamarathon.javacore.jdbc.service.ProducerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConnectionFactoryTest01 {
    private static final Logger log = LogManager.getLogger(ConnectionFactoryTest01.class);

    public static void main(String[] args) {

//        List<Producer> producers = ProducerService.findAll();
//        List<Producer> producers = ProducerService.findByName("a");
//        log.info("Producers: '{}'", producers);
//        ProducerService.showProducerMetadata();
//        ProducerService.showDbMetadata();
//        ProducerService.showTypeScrollWorking();

        ProducerService.findByNameAndDelete("bom");
    }
}

