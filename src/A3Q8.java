/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class A3Q8 {

    public void insertionSort(String[] n) {

        String[] inputArray = {};

        for (int i = 1; i < n.length; i++) {
            int j = i;
            while (j > 0 && n[j - 1].compareToIgnoreCase(n[j]) > 0) {
                String temp = n[j];
                n[j] = n[j - 1];
                n[j - 1] = temp;
                j--;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q8 test = new A3Q8();

        String[] n = {"a", "cat", "lemon", "monopoly", "lol", "haha", "IHateLauren"};
        test.insertionSort(n);

        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i] + " ");
        }
    }
}
