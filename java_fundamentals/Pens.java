public class Pens{
  public static void main(String[] args) {
      int pen=14;
      int students=3;
      int remains=pen%students;
      int penperStudent=(pen-remains)/students;
      System.out.println("Each student gets " + penperStudent + " pens.");
      System.out.println("Remaining pens: " + remains);
  }
}