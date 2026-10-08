interface payment{
    void pay();
}
class UPI implements payment{
    public void pay(){
        System.out.println("pay using online..");
    }
}
class craditCard implements payment{
    public void pay(){
        System.out.println("pay using cradit card");
    }
}
class interFace{
    public static void main(String[] args){
        UPI p1 = new UPI();
        p1.pay();
        craditCard p2 = new craditCard();
        p2.pay();
    }
}
