# q

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: <https://quarkus.io/>.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw quarkus:dev
```

## gRPC Server

To start the gRPC server, run:

```shell
./mvnw quarkus:dev
```

By default, the gRPC server listens on port `9000`.

To send a request to the `GreeterService.SayHello` method, use `grpcurl`:

```shell
grpcurl -plaintext -d '{ "name": "Foo Bar" }' 0.0.0.0:9000 hello.v1.GreeterService.SayHello
```

You should receive a response similar to:

```json
{
  "message": "Hello Foo Bar"
}
```