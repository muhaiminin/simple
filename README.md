# Simple Application

This is just a simple application to showcase the use of springboot and angular running using docker-compose.

Requirements:
- linux
- docker
- npm (node 10)
- mvn 3.5
- jdk11

## Web

This is a simple angular 8 application. To build, use npm,
```
cd web
npm install
npm run build
```

If npm is not installed, build using docker, by running web/build.sh
```
cd web
docker run -it --rm --name npmbuild \
    -v `pwd`:/app \
    -u `id -u` \
    node:10-alpine /app/build.sh
```


## Springboot Server

Build using maven,
```
cd server
mvn clean package
```
The application is built using an API-first approach, where the API is being generated by https://www.apicur.io/
The resulting swagger is then saved on the api module, and the required interface and dto is generated.

The _client_ is actually hardcoded inside the configuration file, you may change the contents
of application.yml in server/app folder.

## Build docker images

Both the web and server part should already being built before running this.

Using the provided docker-compose.yml
```
docker-compose build
```

## Running

Use the provided docker-compose.yml
```
docker-compose up
```

## Checking the result

For direct access, use the following ports:
- Springboot localhost:8083
- Web, using browser http://localhost:8000

On the browser, the UI is simply displaying a table of clients on load.