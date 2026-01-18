package javamarathon.javacore.enums.domain;

public enum InfoClient {
    NATURAL_PERSON(1, "Natural Person"),
    LEGAL_ENTITY(2, "Legal Entity");

    private final int clientId;
    private final String clientDescription;

    InfoClient(int clientId, String description) {
        this.clientId = clientId;
        this.clientDescription = description;
    }

    public static InfoClient fromDescription(String description) {
        for (InfoClient infoClient : InfoClient.values()) {
            if (infoClient.getClientDescription().equals(description)) {
                return infoClient;
            }
        }
        return null;
    }

    public int getClientId() {
        return clientId ;
    }

    public String getClientDescription() {
        return clientDescription;
    }
}

