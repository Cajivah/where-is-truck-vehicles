package com.whereistruck.domain.serializer;

import java.nio.charset.StandardCharsets;

import com.whereistruck.domain.dto.NewLocation;

import io.quarkus.kafka.client.serialization.JsonbDeserializer;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

public class NewLocationDeserializer extends JsonbDeserializer<NewLocation> {
    private final Logger LOGGER = LoggerFactory.getLogger(NewLocationDeserializer.class);

    public NewLocationDeserializer(){
        super(NewLocation.class);
    }

    @Override
    public NewLocation deserialize(final String topic, final byte[] data) {
        LOGGER.debug(new String(data, StandardCharsets.UTF_8));
        return super.deserialize(topic, data);
    }
}
