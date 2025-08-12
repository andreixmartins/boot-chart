# Helm Boot Chart



## Building docker image

```bash
docker build -t boot-chart .
```

## Run boot-chart app

```bash
docker run -p 8282:8282 boot-chart
```

## Testing

```bash
curl -L http://localhost:8282
```

## Publish image to docker registry

```bash
docker login
docker tag boot-chart:latest axsoftware/boot-chart
docker push  axsoftware/boot-chart
```


