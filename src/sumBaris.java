public class sumBaris {

    public static int sumBaris(int n) {

        int lastnum = 0;
        int total = 0;
        for(int row=1;row<;row++){
            total=0;
            for(int x_row=1;x_row<=row;x_row++){
            if(row > 1){
                lastnum+=2;
                System.out.println(lastnum);
                total+=lastnum;
            }else {
                System.out.println(x_row);

            }
        }

        return n * n * n;
    }
        public static void main(String[]args){

        System.out.println(sumBaris(2));
        System.out.println(sumBaris(3));
        System.out.println(sumBaris(4));
        System.out.println(sumBaris(5));

    }
}
