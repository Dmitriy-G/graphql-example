package com.example.graphqlexample.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphqlexample.domain.TestModel;
import org.springframework.stereotype.Component;

@Component
public class TestQuery implements GraphQLQueryResolver {
    public TestModel getTestModel(final int id) {
        System.out.printf("Data %s was changed%n", id);
        return new TestModel(1, "test");
    }
}
