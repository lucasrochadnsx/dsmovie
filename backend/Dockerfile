FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
# Copia o conteúdo da pasta backend para dentro da imagem
COPY backend/ . 
RUN mvn clean package -DskipTests -Dmaven.test.skip=true -Dspring-boot.repackage.skip=false
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
