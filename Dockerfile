FROM open-liberty

COPY --chown=1001:0 \
    src/main/liberty/config \
    /config/

COPY --chown=1001:0 \
    target/dremio-poc.war \
    /config/apps

ENV LICENSE accept

RUN configure.sh

EXPOSE 9080
