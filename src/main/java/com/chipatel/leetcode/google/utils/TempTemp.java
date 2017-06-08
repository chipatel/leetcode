/**
 * 
 */
package com.chipatel.leetcode.google.utils;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class TempTemp {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // System.out.println(getCoordinates(5, 'L'));
    // System.out.println(getCoordinates(5, 'P'));
    // System.out.println(getCoordinates(5, 'R'));
    // System.out.println(getCoordinates(5, 'G'));

    // System.out.println(getPath(new Coordinates(2, 1), new Coordinates(3, 0), 5));
    String movieName = "UP";
    int col = 5;
    StringBuilder sb = new StringBuilder();

    sb.append(getPath(new Coordinates(0, 0), getCoordinates(col, movieName.charAt(0)), col));
    System.out.println(sb.toString());
    for (int i = 1; i < movieName.length(); i++) {
      sb.append(getPath(getCoordinates(col, movieName.charAt(i - 1)),
          getCoordinates(col, movieName.charAt(i)), col));
      System.out.println(sb.toString());
    }
    System.out.println("Pattern: -" + sb.toString());
  }


  public static String getPath(Coordinates co1, Coordinates co2, int col) {
    System.out.println(co1.toString() + " -- " + co2.toString());
    StringBuilder tmp = new StringBuilder();
    while (co1.i != co2.i || co1.j != co2.j) {
      if (co1.i == co2.i) {
        if (co1.j < co2.j) {
          tmp.append("D");
          co1.j++;
        } else {
          tmp.append("U");
          co1.j--;
        }
      }
      if (co1.i < co2.i) {
        tmp.append("D");
        co1.i++;
        if (co1.j < co2.j) {
          tmp.append("R");
          co1.j++;
        }
        if (co1.j > co2.j) {
          tmp.append("L");
          co1.j--;
        }
      }
      System.out.println(co1.toString() + " -- " + co2.toString());
      if (co1.i > col || co1.j > col || co2.i > col || co2.j > col) {
        break;
      }
      if (co1.i == co2.i && co1.j == co2.j) {
        tmp.append("!");
        break;
      }

    }
    // System.out.println(tmp.toString());
    return tmp.toString();
  }


  public static Coordinates getCoordinates(int col, char ch) {
    int i = (ch - 'A') / col;
    int j = (ch - 'A') % col;
    return new Coordinates(i, j);

  }
}


class Coordinates {
  int i;
  int j;

  public Coordinates(int i, int j) {
    this.i = i;
    this.j = j;
  }

  @Override
  public String toString() {
    return "i:- " + i + "\tj:- " + j;
  }

}

