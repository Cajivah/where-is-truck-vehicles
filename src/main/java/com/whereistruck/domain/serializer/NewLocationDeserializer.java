package com.whereistruck.domain.serializer;

import com.whereistruck.domain.dto.NewLocation;

import io.quarkus.kafka.client.serialization.JsonbDeserializer;

public class NewLocationDeserializer extends JsonbDeserializer<NewLocation> {
    public NewLocationDeserializer(){
        super(NewLocation.class);
    }
}
