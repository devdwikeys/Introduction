public class JavaBasicCoreSelenium {

    public static void main(String[] args) {

        int number = 5;
        String name = "Rahul Shitty";
        char letter = 'r';
        double dec = 5.99;
        boolean status = false;

        //how to print into console
        System.out.println("ini type data integer : " + number);
        System.out.println("ini type data String  : " + name);
        System.out.println("ini type data char : " + letter);
        System.out.println("ini type double/float : " + dec);
        System.out.println("ini type data boolean : " + status);

        //pengertian syntax arrays
        int[] arr = new int[10];//start indef from 0,1,2,3,4
        arr[0] = 100;
        arr[1] = 120;
        arr[2] =  310;
        arr[3] = 420;
        arr[4] = 530;

        //bagaimana iniate straight value of array
        System.out.println("ini nge print salah satu index array : " + arr[3]);

        for (int i = 0; i<arr.length; i++){
            System.out.println("Ini ngeprint menggunakan looping untuk nampilin semua index array " + arr[i]);
        }

        for(int i = arr.length - 1; i>= 0; i-- ){
            System.out.println(arr[i]);
        }
    }
}
