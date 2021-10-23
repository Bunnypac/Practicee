import java.util.*;
import java.lang.*;

  class Practice {
      public void printarr() {
          int b = 0;
          String a;


          Scanner s = new Scanner(System.in);
          ArrayList<String> list = new ArrayList<>();

          do {
              System.out.println("enter");
              a = s.next();
              list.add(a);
              System.out.println("Cont press 1");
              b = s.nextInt();
          } while (b == 1);
          list.sort(Comparator.naturalOrder());
          int count = 0;
          for(int i=0;i< list.size()-1;i++){

              if(list.get(i).equals(list.get(i + 1)) ) {
                  count++;

              }
              System.out.println(count);


//          for (String ele : list) {
//              if (ele.charAt(0) == 't') {
//                  System.out.println(ele);
              }
          }

//
//
//              System.out.println(list);
//              int size=list.size();
//              System.out.println(size);
//             // s.close();
//          }
          public static void main (String[]args){
         /* int C;
          Scanner s = new Scanner(System.in);
          do {
              System.out.println("ENter String");
              String A = s.next();
              StringBuilder input1 = new StringBuilder();
              input1.append(A);
              input1.reverse();
              System.out.println(input1);
              C = s.nextInt();
          }
          while (C == 1);*/
              Practice ar = new Practice();
              ar.printarr();

              // write your code here
          }
      }



  /* */
