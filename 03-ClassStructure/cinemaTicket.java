public class cinemaTicket {
    static String name= "cinema1";
    String filmTitle;
    int row;
    int seat;
    double price;

    cinemaTicket(String filmTitle,int row,int seat,double price){
        this.filmTitle=filmTitle;
        this.row=row;
        this.seat=seat;
        this.price=price;
    }

    String displayTicket(){
        return name+"\n"+filmTitle+"\n"+row+"\n"+seat+"\n"+price;
    }

    public static void main(String[] args) {
        cinemaTicket t1 = new cinemaTicket("cars",10,11,14.99);

        System.out.println(t1.displayTicket());
    }


}
