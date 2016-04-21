package pl.training.integration.lab03;

import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;

import java.io.File;

public class ShipOrderFileSelector implements MessageSelector {

    private static final String FILE_PREFIX = "shiporder";

    @Override
    public boolean accept(Message<?> message) {
        Object payload = message.getPayload();
        if (payload instanceof File) {
            File file = (File) payload;
            return file.getName().startsWith(FILE_PREFIX);
        }
        return false;
    }

}
