#!/bin/bash

echo "REMEMBER TO SET JAVA_HOME TO GRAALVM DISTRIBUTION AND SET [DOCKERHUB_USERNAME, DOCKERHUB_PASS] ENV VARIABLES"

./gradlew clean build -Dquarkus.container-image.push=true -Dquarkus.package.type=native -Dquarkus.container-image.username=$DOCKERHUB_USERNAME -Dquarkus.container-image.password=$DOCKERHUB_PASS

