package com.model;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * This class job is to access the Database (ItemRepository == DataAccessObject)
 */

public class ItemRepository {
    private static String filename = "register.csv";

    public List<Item> load() {
        List<Item> register = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(filename))) {
            while (sc.hasNext()) {
                String[] item = sc.nextLine().split(",");
                register.add(new Item(item[0], item[1]));
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return register;
    
    }
    
    public void save(List<Item> table) {
        try (FileWriter fileWriter = new FileWriter(filename)) {
            for(Item i : table) {
                fileWriter.write(i.toString() + "\n");
            }
        } catch (Exception e) {
            System.err.println(e);
        }

    }

    public void insert(Item item) {
        List<Item> table = load();
        table.add(item);
        save(table);

    }
    
}