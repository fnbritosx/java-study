package javamarathon.javacore.enums.domain;

public enum PaymentType{
        PIX{
            @Override
            public double discount(Double value) {
                return value * 0.5;
            }
        },
        DEBIT{
            @Override
            public double discount(Double value) {
                return value * 0.9;
            }
        },
        CREDIT{
            @Override
            public double discount(Double value) {
                return value * 0.85;
            }
        };

        public abstract double discount(Double value);

    }