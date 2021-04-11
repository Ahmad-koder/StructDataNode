package com.company;

import java.io.Serializable;
import java.util.ArrayList;

class Node implements Serializable {

    private final String value;

    final ArrayList<Node> nodes = new ArrayList<Node>();

    Node(String value) {
        this.value = value;
    }

    void SetNodes(Node node)
    {
        nodes.add(node);
    }

    String GetValue()
    {
        return value;
    }

}