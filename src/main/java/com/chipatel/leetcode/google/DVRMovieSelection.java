/**
 * 
 */
package com.chipatel.leetcode.google;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class DVRMovieSelection {

  public Map<Character, DVRMovieSelection.Cell> cellMapping =
      new HashMap<Character, DVRMovieSelection.Cell>();

  public String dvrMoiveSelection(String movie, int matSize) {
    cellMappingForAtoZ(matSize);
    Cell curr, dest;
    StringBuffer sb = new StringBuffer();
    char[] movieArray = movie.toCharArray();

    for (int i = 0; i < movieArray.length; i++) {
      if (i == 0) {
        curr = new Cell(0, 0);
      } else {
        curr = cellMapping.get(movieArray[i - 1]);
      }
      dest = cellMapping.get(movieArray[i]);
      sb.append(move(curr, dest));
    }
    return sb.toString();
  }

  public void cellMappingForAtoZ(int matrixSize) {
    int aToZ = 0;
    for (int i = 0; i <= 26 / matrixSize; i++) {
      for (int j = 0; j < matrixSize; j++) {
        cellMapping.put((char) ('A' + aToZ), new DVRMovieSelection.Cell(i, j));
        cellMapping.put((char) ('a' + aToZ), new DVRMovieSelection.Cell(i, j));
        if (aToZ < 25) {
          aToZ++;
        } else {
          break;
        }
      }
    }
  }

  public StringBuffer move(Cell curr, Cell dest) {
    StringBuffer sb = new StringBuffer();
    if (curr.y < dest.y) {
      sb.append("R");
      sb.append(move(new Cell(curr.x, curr.y + 1), dest));
    } else if (curr.y > dest.y) {
      sb.append("L");
      sb.append(move(new Cell(curr.x, curr.y - 1), dest));
    } else if (curr.x < dest.x) {
      sb.append("D");
      sb.append(move(new Cell(curr.x + 1, curr.y), dest));
    } else if (curr.x > dest.x) {
      sb.append("U");
      sb.append(move(new Cell(curr.x - 1, curr.y), dest));
    } else {
      sb.append("!");
    }
    return sb;
  }

  class Cell {
    int x;
    int y;
    String letter;

    Cell(int x, int y) {
      this.x = x;
      this.y = y;
    }

    @Override
    public String toString() {
      return this.x + "--" + this.y;
    }
  }
}
