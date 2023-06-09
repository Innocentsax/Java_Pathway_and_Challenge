public class The_Loop {
    public static void main(String[] args){

        for (int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        int j = 1;
        while (j <= 5){
            System.out.println(j);
            j++;
        }

        int m = 1;
        while (true){
            if (m <= 5){
                break;
            }System.out.println(m);
            m++;
        }

        int mk = 1;
        boolean isReady = false;
        while (isReady){
            if (mk <= 5){
                break;
            }System.out.println(mk);
            mk++;
        }

        int mkq = 1;
        boolean isReadyh = false;
        do {
            if (mkq > 5){
                break;
            }System.out.println(mkq);
            mkq++;
            isReadyh = (mkq > 0);
        }while (isReadyh);

        int num = 0;
        while (num < 50){
            num += 5;
            if (num % 25 == 0){
                continue;
            }
            System.out.print(num + "_");
        }
    }
}
