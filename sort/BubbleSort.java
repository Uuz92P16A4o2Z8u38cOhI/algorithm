/**
 * 冒泡
 * @author hyl
 */
public class BubbleSort {

    /**
     * 升序
     * @param array
     */
    public void ascSort(int[] array) {
        int i,j;

        for (i=0; i<array.length-1; i++) {
            for (j=0; j<array.length-1-i; j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    /**
     * 降序
     * @param array
     */
    public void descSort(int[] array) {
        int i,j;

        for (i=0; i<array.length-1; i++) {
            for (j=0; j<array.length-1-i; j++) {
                if (array[j] < array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
}
