package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapNode {

    private Map<String, Node> mapNode = new HashMap<String, Node>();

    private Scanner in = new Scanner(System.in);

    public void makeNode ()
    {
        System.out.println("Enter key-string");

        String key = in.nextLine();

        Node node = new Node(key);

        mapNode.put(node.GetValue(), node);
    }

    public void redNode() {

        System.out.println("Enter key-string for redaction");

        String key = in.nextLine();

        Node node = mapNode.get(key);

        if (node != null) {

            System.out.println("Enter key-string for add");

            String keyAdd = in.nextLine();

            node.SetNodes(mapNode.get(keyAdd));

            mapNode.put(node.GetValue(), node);
        }
    }

    public void addFromFile() {
        System.out.println("Enter key-string for add to text");

        String key = in.nextLine();

        Node node = mapNode.get(key);

        if (node != null) {

            System.out.println("Enter name of file");

            String File = in.nextLine();

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(File))) {
                oos.writeObject(node);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void addToFile()
    {
        System.out.println("Enter key-string for add to text");

        String File = in.nextLine();

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(File)))
        {
            Node node = (Node)ois.readObject();
            mapNode.put(node.GetValue(), node);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }

}
