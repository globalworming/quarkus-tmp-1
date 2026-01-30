clone, then run

```
./mvnw test | grep "Secret" | grep "INFO"
```
> 2026-01-30 13:44:05,699 INFO  [org.jboss.resteasy.reactive.client.logging.DefaultClientLogger] (vert.x-eventloop-thread-2) Request: GET https://example.com/ Headers[Authorization=Bearer superSecretToken User-Agent=Quarkus REST Client], Empty body
