#!/bin/bash

./gradlew clean build -Dquarkus.container-image.push=true -Dquarkus.package.type=native -Dquarkus.container-image.username=$DOCKERHUB_USERNAME -Dquarkus.container-image.password=$DOCKERHUB_PASS

