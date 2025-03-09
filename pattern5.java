/*
Expected Output:
54321
54321
54321
54321
54321

***** ***** ***** ***** *****
*/ 
class Main {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            
            for(int j=1;j<=5;j++){
                System.out.print(5-j+1);
            }
            System.out.println();
        }
    }
}
