package com.kobylynskyi.graphql.codegen.model.graphql.data;

import java.util.*;
import com.kobylynskyi.graphql.codegen.model.graphql.*;

public class VersionQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "version";

    private Map<String, Object> input = new LinkedHashMap<>();

    public VersionQueryRequest() {
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static class Builder {


        public Builder() {
        }


        public VersionQueryRequest build() {
            VersionQueryRequest obj = new VersionQueryRequest();
            return obj;
        }

    }
}