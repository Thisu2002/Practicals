object Ticket{
    def main(args: Array[String]): Unit= {
        //enter any ticket price and see the profit
        println("Profit: Rs." + profit(15));
    }

    def attendees(ticketPrice :Int): Int={
        var attendees = 120 + (15 - ticketPrice)/5 * 20;
        return attendees;
    }

    def revenue(ticketPrice: Int):Int = {
        ticketPrice * attendees(ticketPrice);
    }

    def cost(ticketPrice:Int):Int ={
        val perfCost = 500;
        var attendeeCost = 3 * attendees(ticketPrice);
        return perfCost + attendeeCost;
    }

    def profit(ticketPrice: Int): Double={
        revenue(ticketPrice) - cost(ticketPrice);
    }
}