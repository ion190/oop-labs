package oop.practice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;


public class Main {
  public static void main(String[] args) {
    System.out.println("Current Working Directory: " + System.getProperty("user.dir"));

    ReaderJSON reader = new ReaderJSON();
    reader.printJSON("src/main/resources/input.json");

  }
}

