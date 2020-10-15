To test, start app

`./mvnw spring-boot:run`

and then make an application/x-www-form-urlencoded form post

`curl http://localhost:8080/form -d "field1=Bob" -d "field2=McGee"`

Expected result: success and log / show posted form parameters

Actual result: `@RequestParam` arguments are null and response is 
`{"timestamp":"2020-10-15T12:45:14.355+00:00","status":400,"error":"Bad Request","message":"","path":"/form"}`

Comment out `logbook-spring-boot-starter` in pom.xml - restart and test again, 
 the result is successful. 



