package Sources;


public class Order {


    String selectedMovie;
    String selectedDay;
    String selectedTime;
    int totalNoOfStudentTicket, totalNumberOfChildTicket, totalNumberofStandardTicket, totalOAPTicket;

    final int standardPrice=8,oapPrice=6,studentPrice=6,childPrice=4;

    public Order(String selectedMovie, String selectedDay, String selectedTime, int totalNoOfStudentTicket, int totalNumberOfChildTicket, int totalNumberofStandardTicket, int totalOAPTicket) {
        this.selectedMovie = selectedMovie;
        this.selectedDay = selectedDay;
        this.selectedTime = selectedTime;
        this.totalNoOfStudentTicket = totalNoOfStudentTicket;
        this.totalNumberOfChildTicket = totalNumberOfChildTicket;
        this.totalNumberofStandardTicket = totalNumberofStandardTicket;
        this.totalOAPTicket = totalOAPTicket;
    }

    public int getTotalPrice(){
        boolean hasDiscount=checkForDiscount();
        if(hasDiscount)
            return totalNumberofStandardTicket*(standardPrice-2)+totalOAPTicket*(oapPrice-2)+totalNoOfStudentTicket*(studentPrice-2)+totalNumberOfChildTicket*(childPrice-2);
        else
            return totalNumberofStandardTicket*standardPrice+totalOAPTicket*oapPrice+totalNoOfStudentTicket*studentPrice+totalNumberOfChildTicket*childPrice;

    }

    public boolean checkForDiscount(){

        return selectedDay=="Tuesday";
    }


    @Override
    public String toString() {
        return
                "selectedMovie='" + selectedMovie + '\n' +
                "selectedTime='" + selectedTime + '\n' +
                "totalNoOfStudentTicket=" + totalNoOfStudentTicket + '\n' +
                "totalNumberOfChildTicket=" + totalNumberOfChildTicket + '\n' +
                "totalNumberofStandardTicket=" + totalNumberofStandardTicket + '\n' +
                "totalOAPTicket=" + totalOAPTicket + '\n' + '\n' +

                "Total Price = £" + getTotalPrice();
    }
}
