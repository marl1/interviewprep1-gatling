```
docker build -t ma-belle-image-postgres-et-cowsay .
```

```
docker run -d --name mon-conteneur-postgres-et-cowsay -p 5432:5432 --env-file ../.env ma-belle-image-postgres-et-cowsay
```