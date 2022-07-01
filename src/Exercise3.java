public class Exercise3 {
    public Exercise3() throws InterruptedException {
        int a = 1;
        while (a<=100){
            System.out.print(""+a+"");
            if (a%15==0) {
                System.out.println(" Z ");
            } else if(a % 3 == 0){
                System.out.println(" X ");
            } else if (a%5==0){
                System.out.println(" Y ");
            } else{
                System.out.println("");
            }
            a++;
            Thread.sleep(990);
        }
    }
}
