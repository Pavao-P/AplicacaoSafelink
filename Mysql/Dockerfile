FROM mysql:8.0
USER 1001
WORKDIR /app
ENV MYSQL_ROOT_PASSWORD=rootpass
ENV MYSQL_DATABASE=desafio_fiap
ENV MYSQL_USER=fiapuser
ENV MYSQL_PASSWORD=fiappass
COPY init.sql /docker-entrypoint-initdb.d/
EXPOSE 3306
