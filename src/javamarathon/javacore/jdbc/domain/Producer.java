package javamarathon.javacore.jdbc.domain;

public class Producer {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static final class ProducerBuilder {
        private Integer id;
        private String name;

        public ProducerBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public ProducerBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Producer build() {
            Producer producer = new Producer();
            producer.id = this.id;
            producer.name = this.name;
            return producer;
        }
    }
}
