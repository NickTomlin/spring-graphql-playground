package com.ntomlin.subgql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

/*
    our root Query resolver. This is automatically wired up to the schema define din resources/schema/*.graphqls
    by graphql-java-tools.

    This is a catch-all for domain objects that cannot be handled by their own resolver class (e.g. SpotifyResolver)
 */
@Component
public class Query implements GraphQLQueryResolver {
    public String getTest () {
        return "Test";
    }
}
