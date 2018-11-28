package com.ntomlin.subgql;

import graphql.Scalars;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLSchema;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/*
    This is an example of manually wiring schema (vanilla java-graphql)
 */
@Configuration
public class SchemaConfig {
//    private final GraphQLObjectType greeting = GraphQLObjectType.newObject()
//            .name("greeting")
//            .field(f -> f
//                    .name("hi")
//                    .type(Scalars.GraphQLString)
//            )
//            .field(f -> f
//                    .name("goodbye")
//                    .type(Scalars.GraphQLString)
//            ).build();
//
//    @Bean
//    GraphQLSchema schema(MainFetcher mainFetcher) {
//        return GraphQLSchema.newSchema()
//                .additionalType(greeting)
//                .query(GraphQLObjectType.newObject()
//                        .name("query")
//                        .field(field -> field
//                                .name("test")
//                                .type(Scalars.GraphQLString)
//                                .dataFetcher(environment -> "response")
//                        )
//                        .field(field ->
//                                field.name("spotify")
//                                        .type(Scalars.GraphQLString)
//                                        .dataFetcher(environment -> mainFetcher.getSpotifyData())
//                        )
//                        .field( field ->
//                                field.name("greeting")
//                                        .type(greeting)
//                                        .dataFetcher(environment -> {
//                                            Map<String, String> greetingData  = new HashMap<>();
//                                            greetingData.put("hi", "hello");
//                                            greetingData.put("goodbye", "g'day");
//                                            return greetingData;
//                                        })
//                        )
//                )
//                .build();
//    }
}
