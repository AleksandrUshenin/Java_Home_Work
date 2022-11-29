public class Start {
    public static void main(String[] args) {
        Example example = new Example();
        System.out.println(example.culc(10, 0));
        try {
            var d = example.addInt(new int[5], 6, 10);
            System.out.println(d);
        }
       catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
       }
        try {
            example.ex(null);
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        }

        var res = example.arr1(new int[] { 10, 20, 30 }, new int[] {1, 2, 3});
        var res2 = example.arr1(new int[] { 10, 20, 30 }, new int[] {1, 2});
        System.out.println(res[0] + " " + res[1] + " " +  res[2]);
        System.out.println(res2[0] + " " + res2[1] + " " +  res2[2]);

        System.out.println(example.getInt("asfg"));
        Example2 example2 = new Example2();
        System.out.println(example2.ex1(new int[]{ 10, 20, 30}, new int[] {1, 2}));
    }
}
