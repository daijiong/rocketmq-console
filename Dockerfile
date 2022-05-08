FROM openjdk:8-jre-slim
LABEL author="daijiong"
ENV TZ=PRC
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
RUN mkdir -p /rocketmq-console
WORKDIR /rocketmq-console
EXPOSE 7298
ADD ./target/rocketmq-console.jar ./
CMD sleep 10;java -Dfile.encoding=utf-8 -Djava.security.egd=file:/dev/./urandom -jar rocketmq-console.jar