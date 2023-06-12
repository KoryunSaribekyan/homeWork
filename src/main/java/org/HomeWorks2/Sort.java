package org.HomeWorks2;

public class Sort {

            public static void heapSort(int[] arr) {
                int n = arr.length;
                for (int i = n / 2 - 1; i >= 0; i--) {
                    heapify(arr, n, i);
                }
                for (int i = n - 1; i >= 0; i--) {
                    int temp = arr[0];
                    arr[0] = arr[i];
                    arr[i] = temp;
                    heapify(arr, i, 0);
                }
            }

            private static void heapify(int[] arr, int n, int i) {
                int largest = i;
                int left = 2 * i + 1;
                int right = 2 * i + 2;

                if (left < n && arr[left] > arr[largest]) {
                    largest = left;
                }

                if (right < n && arr[right] > arr[largest]) {
                    largest = right;
                }

                if (largest != i) {
                    int swap = arr[i];
                    arr[i] = arr[largest];
                    arr[largest] = swap;

                    heapify(arr, n, largest);
                }
            }

            public static void main(String[] args) {
                int[] arr = {9, 2, 5, 1, 7, 6, 3, 8, 4};

                System.out.println("Исходный массив:");
                printArray(arr);

                heapSort(arr);

                System.out.println("Отсортированный массив:");
                printArray(arr);
            }

            private static void printArray(int[] arr) {
                for (int value : arr) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }
