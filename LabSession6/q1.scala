case class Product(pid: String, name: String, quantity: Int, price: Double)

object InventoryApp{
    def main(args:Array[String]): Unit = {
        val inventory1: Map[String, Product] = Map(
        "P001" -> Product("P001", "Product A", 10, 50.0),
        "P002" -> Product("P002", "Product B", 25, 100.0),
        "P003" -> Product("P003", "Product C", 15, 150.0)
        )

        val inventory2: Map[String, Product] = Map(
        "P002" -> Product("P002", "Product B", 10, 120.0),
        "P004" -> Product("P004", "Product D", 20, 80.0)
        )

        // question I
        val productNames: Iterable[String] = inventory1.values.map(_.name)
        productNames.foreach(println)

        println("--------------------------------------------------------")
        // question II
        val totalValue: Double = inventory1.values.map(product => product.quantity * product.price).sum
        println("Value of all products: " + totalValue)

        println("--------------------------------------------------------")
        // question III
        println(s"Is inventory empty? " + (if (inventory1.isEmpty) "yes" else "no"))

        println("--------------------------------------------------------")
        // question IV
        val mergedInventory: Map[String, Product] = (inventory1.keySet ++ inventory2.keySet).map { key =>
        val product1 = inventory1.get(key)
        val product2 = inventory2.get(key)
        val mergedProduct = (product1, product2) match {
            case (Some(p1), Some(p2)) =>
            Product(p1.pid, p1.name, p1.quantity + p2.quantity, math.max(p1.price, p2.price))
            case (Some(p1), None) => p1
            case (None, Some(p2)) => p2
            case _ => Product("", "", 0, 0.0)
        }
        key -> mergedProduct
        }.toMap

        println("Merged Inventory:")
        mergedInventory.foreach { case (id, product) =>
        println(s"ID: ${product.pid}, Name: ${product.name}, Quantity: ${product.quantity}, Price: ${product.price}")
        }

        println("--------------------------------------------------------")
        // question V
        val findId = "P003"
        inventory1.get(findId) match {
            case Some(product) => {
                println(s"Product found!")
                println(s"ID: ${product.pid}, Name: ${product.name}, Quantity: ${product.quantity}, Price: ${product.price}")
            }
            case None => println(s"Product with ID $findId not found.")
        }
    }
}
