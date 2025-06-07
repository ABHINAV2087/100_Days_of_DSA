
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        return guessNumber(1,n);    
    }
    public int guessNumber(int low,int n) {
        int middle;
        Random rand=new Random();
        while(low<=n)
        {
        middle = low + rand.nextInt(n - low + 1);
        if(guess(middle)==0)
            return middle;
        if(guess(middle)==1)
            low=middle+1;
        else
            n=middle-1;  
        }
        return -1;     
}
}
