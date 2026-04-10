FROM eclipse-temurin:17

WORKDIR /app

COPY src/ /app/src/

RUN find src -name "*.java" > sources.txt && javac -d out @sources.txt


CMD ["java", "-cp", "out", "Main"]