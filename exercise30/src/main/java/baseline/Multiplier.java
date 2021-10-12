package baseline;


public interface Multiplier {
    //  Create Method: public void multiplyTable()
    static void multiplyTable(){
        int i;
        int j;
        for (i = 1 ;i <= 12; i++) {
            for (j = 1 ;j <= 12; j++) {
                if (i*j < 10)
                    System.out.print("    " + i*j);
                else if (i*j < 100)
                    System.out.print("   " + i*j);
                else
                    System.out.print("  " + i*j);
            }
            System.out.print("\n");
        }
    }
}