package test;

import java.util.*;

public class Class2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();

        int[] arr1= Arrays.stream(str1.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2= Arrays.stream(str2.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr3= Arrays.stream(str3.split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] Ax = new int[]{arr1[0], arr1[0] + arr1[2]};
        int[] Ay = new int[]{arr1[1] - arr1[3], arr1[1]};

        int[] Bx = new int[]{arr2[0], arr2[0] + arr2[2]};
        int[] By = new int[]{arr2[1] - arr2[3], arr2[1]};

        int[] Cx = new int[]{arr3[0], arr3[0] + arr3[2]};
        int[] Cy = new int[]{arr3[1] - arr3[3], arr3[1]};

        List<int[]> listX = new ArrayList<>();
        listX.add(Ax);
        listX.add(Bx);
        listX.add(Cx);

        int subX = getSub(listX);

        List<int[]> listY = new ArrayList<>();
        listY.add(Ay);
        listY.add(By);
        listY.add(Cy);
        int subY = getSub(listY);

        System.out.println(subX*subY);
    }

    private static int getSub(List<int[]> list) {
        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int left = Math.max(Math.max(list.get(0)[0], list.get(1)[0]), list.get(2)[0]);
        int right = Math.min(Math.min(list.get(0)[1], list.get(1)[1]), list.get(2)[1]);
        if(right> left) {
            return right - left;
        } else {
            return 0;
        }
    }

}
