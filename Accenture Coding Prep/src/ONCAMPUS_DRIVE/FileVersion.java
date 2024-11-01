package ONCAMPUS_DRIVE;

/*

You are given a string array S that contains the names of some files along with their versions. Your task is to find and return an integer value representing the latest version out of all the files that are correctly named in the array.

A file is considered correct if it follows the format of the file named as "File_X" (where X represents the file version number).

Return -1 if there are no correct files in the array.

Notes:
A file is incorrect if the name of the file does not match the format.
If there is no file in the array or no correct files, return -1.

Input Specification:
Input 1: A string array S, representing the names of the files.
Input 2: An integer representing the size of the array.

Output Specification:
Return an integer value representing the latest version out of all the correctly named files in the array.

Example:

Input:
N = 5
S = ["File_2", "Filr 1", "File-6", "File_3"]

Output:
6

Conditions for Correctness:
The file name should be at least 6 characters long.
The first 5 characters should be "File_".
The remaining part of the string should represent a valid integer for the file version number.


*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FileVersion
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s[] = new String[n];

        for(int i=0;i<n;i++)
            s[i]=in.next();

        int res = generate(s,n);
        System.out.println(res);

    }

    private static int generate(String[] s, int n)
    {
        int maxVersion = Integer.MIN_VALUE;
        for(String str : s)
        {
            if(str.length()>=6 && str.startsWith("File_")) {
                String remain = str.substring(5);
                try{
                    int version = Integer.parseInt(remain);
                    maxVersion=Math.max(maxVersion,version);
                }
                catch(Exception e)
                {
                    continue;
                }
            }

        }

        if(maxVersion>Integer.MIN_VALUE)
            return maxVersion;

        return -1;
    }
}
