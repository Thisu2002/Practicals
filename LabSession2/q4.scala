object Ticket{
    def main(args: Array[String]): Unit= {
        //enter any ticket price and see the profit
        println("Profit: Rs." + profit(15));
    }

    def attendees(ticketPrice :Int): Int={
        val attendeesForZero = 180;
        var priceIncrement = ticketPrice/5;
        var attendees = attendeesForZero - (priceIncrement * 20);

        return attendees;
    }

    def profit(ticketPrice: Int): Double={
        val perfCost = 500;
        var numOfAttendees = attendees(ticketPrice);
        var attendeeCost = 3 * numOfAttendees;
        var totCost = perfCost + attendeeCost;

        var totIncome = numOfAttendees * ticketPrice;
        return totIncome - totCost;
    }
}