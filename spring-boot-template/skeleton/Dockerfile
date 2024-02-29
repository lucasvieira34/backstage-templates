# Builder
FROM ghcr.io/graalvm/graalvm-ce:22.2.0
COPY    ./.m2 /root/.m2
COPY    . /root/app/
WORKDIR /root/app
RUN     ./mvnw clean install -Denforcer.skip=true

# Application
FROM ghcr.io/graalvm/graalvm-ce:22.2.0
COPY --from=0 /root/app/target/*.jar /home/app/
WORKDIR /home/app
RUN chmod 0777 /home/app
EXPOSE ${{ values.port }}
ENTRYPOINT java -jar $JAVA_OPTIONS *.jar $APP_ARGS