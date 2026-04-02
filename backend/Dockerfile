FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
# Copia apenas o pom.xml primeiro para aproveitar o cache de dependências
COPY pom.xml .
RUN mvn dependency:go-offline

# Copia o restante do código e compila
COPY src ./src
RUN mvn clean package -DskipTests

# Estágio 2: Execução (Imagem leve apenas com JRE)
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
# Copia apenas o JAR gerado no estágio anterior
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
