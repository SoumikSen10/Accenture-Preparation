package ONCAMPUS_DRIVE;

/*

Find the Maximum Number of Favorite Songs in a Playlist

Alice has a collection of songs represented as a string S, where each character represents a song. A playlist is a substring of the given string with exactly K number of songs. She wants to create a playlist that contains the maximum number of her favorite song, which is represented by the character 'a'.

Your task is to find and return an integer value representing the maximum number of favorite songs (i.e., the character 'a') that Alice can get in a single playlist.

Input:
S: A string representing the collection of songs.
K: An integer representing the length of the playlist.
Output:
An integer representing the maximum number of times the character 'a' appears in any playlist of length K.

Example:

Input:
S = "acdbaaca"
K = 3

Output:
2

Explanation: The possible substrings of size 3 are {acd, cdb, dba, baa, aac, aca}. The substring "aac" contains 2 'a's, which is the maximum.

*/

import java.util.Scanner;

public class SongsCollection
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k =in.nextInt();

        int ans = generate(s,k);
        System.out.println(ans);
    }

    private static int generate(String s,int k)
    {
        //optimized approach with sliding window
        int i=0,j=0,n=s.length(),count=0,maxi=0;

        while(j<k-1) //calculating for first window of k size
        {
            if (s.charAt(j) == 'a') {
                count++;
            }
            j++;
        }

        maxi=count;

        while(j<n-1)
        {
            if(s.charAt(i)=='a')
            {
                count--;
            }
            i++;

            if(s.charAt(j)=='a')
            {
                count++;
            }
            j++;

            maxi = Math.max(maxi,count);
        }

        return maxi;
    }
}

/*

Explanation:

Sliding Window Setup:
We first initialize the window of size k and count how many 'a' characters are there in the first window.

After the initial window setup, we slide the window by moving both the start (i) and the end (j) pointers one step to the right.

Window Movement:
For each step, we remove the character that is being excluded from the window (i.e., at index i) and include the new character entering the window (i.e., at index j).

We update the maximum number of 'a's found in any window of size k.

Example:

For input:
S = "acdbaaca"
K = 3

Output:
2

*/