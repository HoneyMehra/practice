package demo;

public class NextPalindrome 
{   
    int rev, temp;
    int printNextPalindrome(int n) 
    {
        int num = n;
        for (int i = num+1; i >= num; i++) 
        {
            temp = i;
            rev = 0;
            while (temp != 0) 
            {
                int remainder = temp % 10;
                rev = rev * 10 + remainder;
                temp = temp / 10;
            }
            if (rev == i) 
            {
                break;
            }
        }
        return rev;
    }
    public static void main(String args[]) 
    {
        NextPalindrome np = new NextPalindrome();
        int nxtpalin = np.printNextPalindrome(11);
        System.out.println(nxtpalin);
    }



}
