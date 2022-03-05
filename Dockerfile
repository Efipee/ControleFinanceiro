FROM azul/zulu-openjdk-alpine:11.0.14-jre-headless
ENV JAR_NAME controleFinanceiro.jar
COPY build/libs/$JAR_NAME $JAR_NAME
EXPOSE 6000
ENTRYPOINT java -jar $JAR_NAME $JAR_NAME