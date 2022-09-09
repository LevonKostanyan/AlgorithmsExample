public class homework_1 {
    public static void main(String[] args) {

// 1.
//       arithmetic operators(թվաբանական);
//
//       + addition
//       - subtraction
//       *	Multiplication
//       /	Division
//       %	Modulus
//       ++ Increment
//       -- Decrement
//
//       relational operators(համեմատության);
//
//       == Equal to
//       != Not equal
//       >	Greater than
//       <	Less than
//       >= Greater than or equal to
//       <= Less than or equal to
//
//       logical operators(տրամաբանական);
//
//       and && Returns true if both statements are true
//       or || Returns true if one of the statements is true
//       not ! Reverse the result, returns false if the result is true
//
//       bitwise operators(բիթային);
//
//       Bitwise OR (|)
//       Bitwise AND (&)
//       Bitwise XOR (^)
//
//       assignment operators(վերագրման);
//
//       =
//       +=
//       -=
//       *=
//       /=
//       %=

// 2.
       int a = 15;
       if(a % 3 == 0 && a % 5 == 0){
           System.out.println("բաժանվում է");
       } else {
           System.out.println("չի բաժանվում");
       }

// 3․
       int x = 1, y = 1, z = 1;
       if(x < y && x < z){
           System.out.println(x);
       } else if (y < x && y < z){
           System.out.println(y);
       } else if (z < x && z < y) {
           System.out.println(z);
       } else {
           System.out.println("փոքրագույն թիվ չկա ");
       }

// 4.
       int a = 6, b = 5;
       int result = 2;
       result = (a > b) ? result * (a - b) : (a < b) ? result * (a + b) : result;
       System.out.println(result);

// 5.
       int day = 8;
       switch (day) {
           case 1:
               System.out.println("Monday");
               break;
           case 2:
               System.out.println("Tuesday");
               break;
           case 3:
               System.out.println("Wednesday");
               break;
           case 4:
               System.out.println("Thursday");
               break;
           case 5:
               System.out.println("Friday");
               break;
           case 6:
               System.out.println("Saturday");
               break;
           case 7:
               System.out.println("Sunday");
               break;
           default:
               System.out.println("Does not exist");
       }
// 6
    }
}