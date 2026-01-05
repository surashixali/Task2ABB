//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Task 1:
Ask the user to enter a number. Determine if the number
is positive, negative, or zero, and print the result.
         */
        /*
        Scanner scanAdd = new Scanner (System.in);
        System.out.println("Enter number: ");
        double num = scanAdd.nextDouble();
        if( num >0){
            System.out.println("Number is positive: " + num);
        }else if(num<0){
            System.out.println("Number is negative: " + num);
        }else {
            System.out.println("Number is zero: " + num);
        }

       */

/* Task 2:
Ask the user to enter a number between 1 and 7.
Print the corresponding day of the week for that number.

For example:

1 – Monday

2 – Tuesday

... and so on.*/
        /*
        Scanner scanAdd2 = new Scanner (System.in);
        System.out.println("Enter number: ");
        int num2 = scanAdd2.nextInt();

        switch(num2){
            case 1:
                System.out.println(num2 + " is Monday");
                break;
            case 2:
                System.out.println(num2 + " is Tuesday");
                break;
            case 3:
                System.out.println(num2 + " is Wednesday");
                break;
            case 4:
                System.out.println(num2 + " is Thursday");
                break;
            case 5:
                System.out.println(num2 + " is Friday");
                break;
            case 6:
                System.out.println(num2 + " is Saturday");
                break;
            case 7:
                System.out.println(num2 + " is Sunday");
                break;
                default:
                    System.out.println("This is not a acceptable number " +
                            "enter correct number");
                    break;
        }
       */




/*Task 8:
A "Strong number" is defined as follows:

If the sum of the factorials of each digit of
the number equals the number itself, then it is a .
145 → 1! + 4! + 5! = 1 + 24 + 120 = → ✅
123 → 1! + 2! + 3! = 1 + 2 + 6 = ≠ 123 → ❌
Calculate the factorial for each digit.
Sum them up and compare the result with the original number. */
/*
        Scanner scanAdd3 = new Scanner (System.in);
        System.out.println("Enter number: ");
        int num3 = scanAdd3.nextInt();



        // Daha sonra ise dushundum ki, bu eded parcalanib,
        // Demek ki, men bu ededi hisselere bolmeyim gereklidir
        // Ededin hisselerini tapmaq uchun ise  10'a bolub qaliqlarini tapmaliyam

        while(num3 >0){
            int result = num3 %10;
            System.out.println(result);
            num3 = num3 / 10;
        }

        // Sonra faktoriali nece tapmali olugumu dushundum:
        // Hemishe faktorial 1'den bashlayir:
        // Ve hemise de hemin ededen kichik olur bir vahid arta arta gedir:
        int resultofFactorial = 1; // 1i neye vursaq hasil deyishmeyecek
        for( int i = 1; i<= num3; i++){
            resultofFactorial *= i;
        }
        System.out.println(resultofFactorial);



        // Ilk once aglima gelen mentiq budur: hansi ki,
        // real numunede gosterildiyi kimi:
        // Ilk once faktoriali sum kimi yazmishdim birinci
       int sum = 0;
        if( num3 ==  sum){
            System.out.println("Number is equal to the sum of " + num3);
        }else {
            System.out.println("Number is not equal to the sum of " + num3);
        }



        // Bu uch mentiqi birlehsdimek var indi:}

        while(num3 > 0){
            int result = num3 % 10;
           System.out.println(result);

            int factorial = 1;
            for( int i = 1; i<= result; i++){
                factorial *= i;
            }
            sum += factorial;
            num3 = num3 / 10;
        }

*/



       /* Task 3:
        Ask the user to enter a number. Using a loop,
        print all the odd numbers up to that number.
        */

/*

        Scanner askUser = new Scanner(System.in);
        System.out.println("Enter number: ");
        int addingNumber = askUser.nextInt();

        for(int i = 1; i<= addingNumber; i++){
            if(i % 2 != 0){
                System.out.println("Add odd number: " + i);
            }
        }

*/
        /*Task 5:
Ask the user to enter their age and gender (M or F).
If the user is under 18, print "Access denied".
If the user is 18 or older, print:
For M: "Male access granted"
For F: "Female access granted"
If the user enters an incorrect gender, print "Invalid gender entered". */

        /*
        Scanner addGender = new Scanner(System.in);
        System.out.println("Enter gender: ");
        // Burada char istifade etdim dersde kechmesek de istifade qaydasini bilirem:
         char gender = addGender.next().charAt(0);

        // String istifade etsem equal (String methodu istifade etmeliyem bu ise
        // derde kechmemishik deye istifade etemdim)
        //String gender = addGender.nextLine();

        Scanner addAge = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = addAge.nextInt();

        if( age <18){
            System.out.println("Access denied: ");
            // String ile equal istifade etmek olardi
            // ilk aglima gelen version bu idi:

            // Mentiqen men 18den yuxari yazsam bu
            // shertleri check edecek ve 18'den boyuk olmasi shertini vermeyim duzgun olmaz:
        }else if( age >=18  && gender == 'M'){
            System.out.println("Male access granted: ");
        }else if (age >=18 && gender == 'F'){
            System.out.println("Female access granted: ");
        }else{
            System.out.println("Invalid gender entered: ");
        }
    */



/* Task 7:
Ask the user to enter a number and calculate its factorial.
If the user enters a negative number, print "Factorial does not exist for negative numbers".
Use loops and (like i++ or --) during the calculation.
Print the result.*/

/*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int numberFactorial = scan.nextInt();


        // 1'i neye vursaq resultda hech bir deyishiklik olmayacaq:
        int multip = 1;
        for(int i = 1; i <= numberFactorial; i++){
             multip *= i;
        }
        System.out.println(multip);


        System.out.println("Your number is: " + numberFactorial);

        if( numberFactorial < 0 && numberFactorial == 0){
            System.out.println("Please enter a valid number:.");
        }else if(numberFactorial %2 == 0){
            System.out.println("Your number is even");
        }else if(numberFactorial % 2 != 0){
            System.out.println("Your number is odd");
        }

*/

        /* Task 4:

Ask the user to enter a number. Perform the following checks:
If the number is a palindrome (e.g., 12321), display:
If the digits of the number are in increasing order (e.g., 123489), indicate that.
If the digits of the number are in decreasing order (e.g., 97530), indicate that.
Otherwise, display:  "The digits are neither in increasing nor decreasing order."*/

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();

        int result = 0;
        while (num > 0) {
            result = num % 10;
            System.out.println(result);
            num = num / 10;
        }

        if (result == num){
            System.out.println("Number is Polindrome");
        }else {
            System.out.println("Number is not Polindrome");
        }
*/
         //Diger sherti qura bilmedim :)))










               /* Task 9:
An is defined as:

If the sum of each digit raised to the power
of the number of digits equals the number itself, then it is an .
153 → 1³ + 5³ + 3³ = 1 + 125 + 27 = → ✅
9474 → 9⁴ + 4⁴ + 7⁴ + 4⁴ = 6561 + 256 + 2401 + 256 = → ✅
123 → 1³ + 2³ + 3³ = 1 + 8 + 27 = ≠ 123 → ❌
Extract the digits of the number.
Count how many digits it has.
Raise each digit to the power of the number of digits.
Sum the results and compare with the original number.*/

        /* Eyni mentqi  istifade etmeye bashlayacam:
        Ilk once ededleri cap etdirecem daha sonra ise diger emeliyyatlar
         */
/*
        Scanner scanAdd4 = new Scanner (System.in);
        System.out.println("Enter number: ");
        int num4 = scanAdd4.nextInt();


        // Ilk once ededleri capa verdim ki, elimde olan ilk hansi ededler var:

        while( num4 > 0){
            int result = num4 % 10;
            num4 = num4 / 10;
            System.out.println(result);
        }

        // Dhaa sonra ise ikindi mentiqi isotifade edirem:
        // Amma uch ededin eyni zaqmanda bir birine nece vurulacagini bilmirem :) just try
        // ilk once try etdim ki, ededi 3 defe nece ozune vurmaq olar sade yolla etdim 3 defe ozune vurmaqla;

        int n = 4;
        while(n > 0){
            int resultofNumbers = n*n*n;
            System.out.println(resultofNumbers);
        }



        int realNumber = num4;
        int sum = 0;
        while ( num4 > 0){
            int result = num4 % 10;
//            System.out.println(result);

            int resultofNumbers = result*result*result;
            //  System.out.println(resultofNumbers);

            sum += resultofNumbers;
            num4 = num4 / 10;


        }


        if( realNumber ==  sum){
            System.out.println("Number is equal to the sum of " + num4);
        }else {
            System.out.println("Number is not equal to the sum of " + num4);
        }
*/
//         Mentqi olaraq ilk defe bele yazmiashdim
//         amma anladigim qederi ile eded 3 reqemli olmaya biler



/*
Task 6:
Write a program that prints Fibonacci numbers.

Ask the user how many Fibonacci numbers to print.
If the entered number is zero or negative, print "Please enter a valid number".
Use loops to print the Fibonacci sequence.
Use a to show whether each Fibonacci number is even or odd.*/

 /*       Scanner scanner6 = new Scanner(System.in);
        System.out.print("How many Fibonacci numbers to print: ");
        int n = scanner6.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid number");
            return;
        }
        int first = 0;
        int second = 1;
        for (int i = 1; i <= n; i++) {

            int fibonacci;

            if (i == 1) {
                fibonacci = first;
            } else if (i == 2) {
                fibonacci = second;
            } else {
                fibonacci = first + second;
                first = second;
                second = fibonacci;
            }

            if (fibonacci % 2 == 0) {
                System.out.println(fibonacci + " is even");
            } else {
                System.out.println(fibonacci + " is odd");
            }
        }

        */
    }
}
