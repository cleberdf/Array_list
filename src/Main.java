import java.util.ArrayList;
import java.util.Collections;

// método que ordena a lista em ordem alfabética
public class Main {

  public static void main(String[] args) {
    ArrayList<String> people = new ArrayList<String>();
    people.add("Lincon ");
    people.add("Joaquim ");
    people.add("Romualdo ");
    people.add("Clodomir ");
    people.add("Washington ");
    Collections.sort(people);
    for (String i : people) {
      System.out.println(i);
    }
  }
}