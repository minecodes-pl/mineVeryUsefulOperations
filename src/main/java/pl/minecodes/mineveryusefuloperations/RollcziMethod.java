package pl.minecodes.mineveryusefuloperations;

/**
 * @author Sky0x
 */
public final class RollcziMethod {

    public static void rollcziMethod(int rows, int cols)  {
        for (int u = 0; u < rows; u++) {
            for (int v = 0; v < cols; v++)  {
                if (u < rows / 2)  {
                    if (v < cols / 2)  {
                        if (v == 0)   {
                            System.out.print("*");
                        }  else  {
                            System.out.print(" "+ " ");
                        }
                    }  else if (v == cols / 2)   {
                        System.out.print(" *");
                    }  else  {
                        if (u == 0)  System.out.print(" *");
                    }
                }  else if (u == rows / 2) {
                    System.out.print("* ");
                }  else  {
                    if (v == cols / 2 || v == cols - 1)  {
                        System.out.print("* ");
                    }  else if (u == rows - 1)  {
                        if (v <= cols / 2 || v == cols - 1)   {
                            System.out.print("* ");
                        }  else {
                            System.out.print(" "+ " ");
                        }
                    }  else  {
                        System.out.print(" "+" ");
                    }
                }
            }
            System.out.print("\n");
        }
    }

}
