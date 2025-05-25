# Etapa 1: Build com Maven e JDK 21
# Etapa 1: Build com Maven e JDK 21
FROM eclipse-temurin:21-jdk AS builder

WORKDIR /app

# Copia todos os arquivos para o container
COPY . .

# Dá permissão de execução ao mvnw
RUN chmod +x ./mvnw

# Compila a aplicação (sem rodar os testes)
RUN ./mvnw clean package -DskipTests

# Etapa 2: Runtime com JRE 21
FROM eclipse-temurin:21-jre

WORKDIR /app

# Copia o JAR da etapa anterior
COPY --from=builder /app/target/*.jar app.jar

# Expõe a porta usada pelo Spring Boot
EXPOSE 8080

# Comando para iniciar a aplicação
CMD ["java", "-jar", "app.jar"]
