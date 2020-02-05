package com.company.jian_zhi_offer;
/**数字在排序数组中出现的次数 */
public class C38_GetNumberOfK {
    public static int GetNumberOfK(int [] array , int k) {
        if (array == null || array.length == 0 || k < array[0] || k > array[array.length - 1]) return 0;
        int start = 0;
        int end = array.length;
        int s_pos = -1;
        int e_pos = -1;
        while (start < end) {
            int middle = (end - start) / 2 + start;
            if (array[middle] > k) end = middle;
            else if (array[middle] < k) start = middle + 1;
            if (array[middle] == k) {
                // 在这里找到起始坐标和终止坐标
                int start4start = start; // 起始坐标二分法
                int end4start = middle + 1;
                while (start4start < end4start) {
                    int middle4start = (end4start - start4start) / 2 + start4start;
                    if (array[middle4start] < k) start4start = middle4start + 1;
                    else if (array[middle4start] == k) {
                        // 判断这个值是不是这个小数组中的第一个元素
                        if (middle4start == start4start || array[middle4start] != array[middle4start - 1]) {
                            // middle4start是起始坐标
                            s_pos = middle4start;
                            break;

                        } else {
                            end4start = middle4start;
                        }
                    }
                }
                int start4end = middle; // 终止坐标二分法
                int end4end = end;
                while (start4end < end4end) {
                    int middle4end = (end4end - start4end) / 2 + start4end;
                    if (array[middle4end] > k) end4end = middle4end;
                    else if (array[middle4end] == k) {
                        if (middle4end == end4end - 1 || array[middle4end] != array[middle4end + 1]) {
                            // middle4end是终止坐标
                            e_pos = middle4end;
                            break;

                        } else start4end = middle4end + 1;
                    }
                }
                break;
            }
        }

        return e_pos == -1 ? 0 : (e_pos - s_pos + 1);

        //可能没找到
    }
    public static void main(String[] args) {
        int[] a = {1,3,4};
        int l = GetNumberOfK(a,5);
        System.out.println(l);
    }
}