/*
Expected Output:
55555
44444
33333
22222
11111

***** ***** ***** ***** *****
*/ 

class Main {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            
            for(int j=1;j<=5;j++){
                System.out.print(5-i+1);
            }
            System.out.println();
        }
    }
}
