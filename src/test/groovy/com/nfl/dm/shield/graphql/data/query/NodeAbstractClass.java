package com.nfl.dm.shield.graphql.data.query;

import com.nfl.dm.shield.graphql.domain.graph.annotation.GraphQLDescription;

@GraphQLDescription("Node interface needed for Relay")
public abstract class NodeAbstractClass {
    public abstract String getId();
}