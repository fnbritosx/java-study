package javamarathon.javacore.jdbc.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Producer {
    private Integer id;
    private String name;

}
