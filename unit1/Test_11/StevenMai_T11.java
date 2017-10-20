/* First Question */
import java.util.Scanner;
public class StevenMai_T11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        int cnt = 0;

        int x = scan.nextInt();
        while (x != 0) {
            if ((N < M && x%N==0 && M%x != 0) || (N >= M && (x==N+M || x==N*M)))
                ++cnt;
            x = scan.nextInt();
        }
        System.out.println(cnt);
        scan.close();
    }
}

/* 
Second Question 

a) 
    The method nextInt() in class Scanner reads an integer from input.
    If Scanner is constructed using System.in, it reads it from standard
    input (the keyboard). However it can also read from files.

    nextInt works by breaking the input into tokens seperated by
    whitespace, and checking if the current token matches an 
    integer. So it ignores all whitespace preceding the number,
    and also takes into account sign.

    For example, the input
    ******
    7
    ******
    produces the same result as
    ******
        7
    ******
    and the input
    ******
    -778
    ******
    produces the result -778.

    If nextInt cannot match an integer, then it throws an exception

b) 

    Error 1: The input does not match type double

    For example, calling nextDouble on this input produces a
    java.util.InputMismatchException

    ******
    notADouble
    ******

    Error 2: You have reached the end of the input.

    This error doesn't happen with stdin, but if you are using 
    Scanner with a file, then if the file is empty and you
    try to read a double, you get a java.util.NoSuchElementException

    Error 3: Input size too large

    This error will never happen in normal use, but it is possible.
    If the size of your double exceeds the memory allocated
    to your program, you will get an error. For example,
    inputting a gigabyte file containing one double

    As evidence that this error will occur, try declaring
    an array of size 10^9 at the beginning of main.
    You will get java.lang.OutOfMemoryError.

c) 

    After input, s1 = "" and s2 = "Hello".

    The reason is after reading the integer, the function
    nextLine adds all the characters preceding the newline
    character '\n' and after the integer to the string s1. 
    However, you press enter immediately, 
    so there are no characters added.

    The function next then reads all characters before a whitespace.
    Since there is a space after Hello, it adds Hello to s2 and stops before World

*/

