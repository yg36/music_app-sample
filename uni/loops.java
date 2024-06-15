// public class loops {
//     public static void main(String[] args){
//         for(int i=0; i<5; i++){
//             System.out.println("hi");
//             if(i==2)
//                 System.out.println("heya");
//         }
//     }
// }

// public class loops {
//     public static void main(String[] args){
//         for(int i=1; i<=10; i++){
//             System.out.println("2*"+i+"="+ 2*i);
//         }
//     }
// }

// public class loops{
//     public static void main(String[] args){
//         int a=1000;
//         int i=0;
//         while(a>0)
//         {
//             if(a%3==0)
//                 i++;
//             a--;
//         }
//         System.out.println(i+"numbers are divisible by 3");
//     }
// }

public class loops{
    public static void main(String[] args){
        int sum=0;
        int i=1;
        do{
            sum+=i;
            i++;
        }
        while(i<10);
        System.out.println("sum of numbers from 1 to 10 is:"+sum);;
    }

}