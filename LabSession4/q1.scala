
object One{
    var names:Array[String] = Array("Flour","Rice","Dhal","Sugar");
    var quantity:Array[Int] = Array(23,54,30,34);
    def main(args:Array[String]):Unit={
        displayInventory(names, quantity);

        restockItem("Rice", 40);
        displayInventory(names, quantity);
        
        sellItem("Dhal", 15);
        displayInventory(names, quantity);
    }

    def displayInventory(x:Array[String], y:Array[Int]):Unit={
        if(!x.isEmpty && !y.isEmpty){
            println(x.head + ":\t" + y.head);
            displayInventory(x.tail, y.tail);
        }
    }

    def restockItem(itemName:String, qty:Int):Unit={
        var count = 0;
        var found =  false;
        for(x <- names if !found){
            if(x == itemName){
                quantity(count) = quantity(count) + qty;
                println(s"Added $qty units of $itemName.");
                found = true;
            }
            else{
                count = count + 1;
            }
        }
        if(!found)
            println(s"Item $itemName not found!");
    }

    def sellItem(itemName:String, qty:Int):Unit={
        var count = 0;
        var found =  false;
        for(x <- names if !found){
            if(x == itemName){
                if(quantity(count) >= qty){
                    quantity(count) = quantity(count) - qty;
                    println(s"Sold $qty units of $itemName.");
                }
                else{
                    println(s"Insufficient Quantity of $itemName.");
                }
                found = true;
            }
            else{
                count = count + 1;
            }
        }
        if(!found)
            println(s"Item $itemName not found!");
    }
}