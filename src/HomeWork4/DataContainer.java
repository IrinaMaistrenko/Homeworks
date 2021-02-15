package HomeWork4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer <T> {
        private T[] data;


    public DataContainer(T[]obj){
            this.data = obj;
        }


        private int findEmptySpace () {
            for (int i = 0; i < this.data.length; i++) {
                if (this.data[i] == null) {
                    return i;
                }
            }
            return -1;
        }

        private static <T > void swap (T[]arr,int from, int to){
            T temp = arr[from];
            arr[from] = arr[to];
            arr[to] = temp;
        }


        public int add (T item){
            int index = findEmptySpace();

            if (index == -1) {
                index = this.data.length;
                this.data = Arrays.copyOf(this.data, index + 1);
            }

            this.data[index] = item;
            return index;
        }

        public T get ( int index){
            if (index > data.length) {
                return null;
            }
            return data[index];
        }

        public T[] getItems () {
            return this.data;
        }

        public boolean delete ( int index){//удалить ячейку

            if (data.length > index) {
                data[index] = null;
                return true;
            }
            return false;
        }

        public boolean delete (T item){

            for (int i = 0; i < data.length; i++) {
                if (data[i] == item) {
                    data[i] = null;
                    if (data[i] == null) {
                        data[i] = data[data.length - 1];
                    }
                    data[data.length] = data[data.length - 1];
                    return true;
                }
            }
            return false;
        }

        public <T> void sort (T[]array, Comparator< T > comparator){
            boolean swap;
            do {
                swap = false;
                for (int i = 0; i < array.length - 1; i++) {
                    if (comparator.compare(array[i], array[i + 1]) > 0) {
                        swap(array, i, i + 1);
                        swap = true;
                    }
                }
            } while (swap);
        }
    }

