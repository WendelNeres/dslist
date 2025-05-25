# Etapa 1: Build com Maven e JDK 21
FROM eclipse-temurin:21-jdk AS builder

WORKDIR /app

# Copia arquivos do projeto
COPY . .

# Compila a aplicação (sem executar testes para agilizar)
RUN ./mvnw clean package -DskipTests

# Etapa 2: Imagem final com JRE 21 (mais leve)
FROM eclipse-temurin:21-jre

WORKDIR /app

# Copia o .jar gerado do builder para o runtime
COPY --from=builder /app/target/*.jar app.jar

# Porta que o Spring Boot usa por padrão
EXPOSE 8080

# Comando para rodar o app
CMD ["java", "-jar", "app.jar"]
