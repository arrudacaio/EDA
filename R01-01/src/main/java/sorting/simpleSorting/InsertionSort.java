package sorting.simpleSorting;

import sorting.AbstractSorting;

/**
 * As the insertion sort algorithm iterates over the array, it makes the
 * assumption that the visited positions are already sorted in ascending order,
 * which means it only needs to find the right position for the current element
 * and insert it there.
 */
public class InsertionSort<T extends Comparable<T>> extends AbstractSorting<T> {

   @Override
   public void sort(T[] array, int leftIndex, int rightIndex) {
      boolean valid = validationInput(array, leftIndex, rightIndex);

      if (valid) {
         T key;
         for (int i = leftIndex + 1; i <= rightIndex; i++) {
            key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(key) > 0) {
               array[j + 1] = array[j];
               j--;
            }
            array[j + 1] = key;

         }
      }

   }

   private boolean validationInput(T[] array, int leftIndex, int rightIndex) {
      boolean result = true;

      if (array == null) {
         result = false;
      }
      if (array.length == 0) {
         result = false;
      }
      if (leftIndex < 0 || rightIndex < 0) {
         result = false;
      }
      if (leftIndex >= array.length || rightIndex >= array.length) {
         result = false;
      }
      if (leftIndex > rightIndex) {
         result = false;
      }
      return result;
   }

}
