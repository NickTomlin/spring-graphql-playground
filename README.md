Graphql Tools error
===

This is a reproduction of the issue seen in https://github.com/graphql-java-kickstart/graphql-java-tools/issues/216

Steps to reproduce:

1. `./gradlew bootRun` should launch the spring boot application, which will throw `.SchemaError: Expected type 'RequestFilter' to be a GraphQLInputType, but it wasn't!` on startup

