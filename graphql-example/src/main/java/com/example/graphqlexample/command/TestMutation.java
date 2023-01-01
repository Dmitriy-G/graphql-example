package com.example.graphqlexample.command;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class TestMutation implements GraphQLMutationResolver {
    public boolean changeTestModel(final int id) {
        System.out.printf("Data %s was changed%n", id);
        return true;
    }
}
