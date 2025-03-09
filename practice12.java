/*
Expected Output:
1 6 11 16 21
 2 7 12 17 22
 3 8 13 18 23
 4 9 14 19 24
 5 10 15 20 25

***** ***** ***** ***** *****
*/

class Main {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            int k=i;
            
            for(int j=1;j<=5;j++){
                System.out.print(" "+k);
                k=k+5;
            }
            System.out.println();
        }
    }
}
