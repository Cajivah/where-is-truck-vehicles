package com.whereistruck.domain.dto;

import java.math.BigDecimal;
import java.util.Objects;

import javax.json.bind.annotation.JsonbCreator;
import javax.json.bind.annotation.JsonbProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class NewLocation {
    private final Coordinates coordinates;
    private final Subject subject;
    private final String locationType;

    @JsonbCreator
    public NewLocation(@JsonbProperty final Subject subject, @JsonbProperty final Coordinates coordinates, @JsonbProperty final String locationType) {
        this.subject = subject;
        this.coordinates = coordinates;
        this.locationType = locationType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public String getLocationType() {
        return locationType;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        final NewLocation that = (NewLocation) o;
        return Objects.equals(subject, that.subject) && Objects.equals(coordinates, that.coordinates)
                && Objects.equals(locationType, that.locationType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, coordinates, locationType);
    }

    @RegisterForReflection
    public static class Subject {
        private final String uuid;


        @JsonbCreator
        public Subject(@JsonbProperty final String uuid) {
            this.uuid = uuid;
        }

        public String getUuid() {
            return uuid;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            final Subject subject = (Subject) o;
            return Objects.equals(uuid, subject.uuid);
        }
        @Override
        public int hashCode() {
            return Objects.hash(uuid);
        }

    }

    @RegisterForReflection
    public static class Coordinates {
        private Coordinate lat;
        private Coordinate lng;

        public Coordinate getLat() {
            return lat;
        }

        public void setLat(final Coordinate lat) {
            this.lat = lat;
        }

        public Coordinate getLng() {
            return lng;
        }

        public void setLng(final Coordinate lng) {
            this.lng = lng;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            final Coordinates that = (Coordinates) o;
            return Objects.equals(lat, that.lat) && Objects.equals(lng, that.lng);
        }

        @Override
        public int hashCode() {
            return Objects.hash(lat, lng);
        }

        @RegisterForReflection
        public static class Coordinate {
            private final BigDecimal value;

            public BigDecimal getValue() {
                return value;
            }


            @JsonbCreator
            public Coordinate(@JsonbProperty final BigDecimal value) {
                this.value = value;
            }

            @Override
            public boolean equals(final Object o) {
                if (this == o)
                    return true;
                if (o == null || getClass() != o.getClass())
                    return false;
                final Coordinate that = (Coordinate) o;
                return Objects.equals(value, that.value);
            }

            @Override
            public int hashCode() {
                return Objects.hash(value);
            }
        }
    }
}

