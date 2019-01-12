package com.ntomlin.subgql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

/*
    our root Query resolver. This is automatically wired up to the schema define din resources/schema/*.graphqls
    by graphql-java-tools.

 */
@Component
public class Query implements GraphQLQueryResolver {
    List<Material> materials(MaterialFilter filter) { return Collections.emptyList(); }
}

class Material {
    Long id;
}

class MaterialFilter {
    String title;
    RequestFilter requestFilter;
}
class RequestFilter {
    List<RequestFilter> and;
    List<RequestFilter> or;
    DiscountTypeFilter discountTypeFilter;
}
class DiscountTypeFilter {
    String name;
}
