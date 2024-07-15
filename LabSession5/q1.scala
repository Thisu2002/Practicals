import scala.io.StdIn.readLine
object InventorySystem{
    def main(args: Array[String]): Unit = {
        var productList = getProductList();
        printProductList(productList);
        println("Total number of products: " + getTotalProducts(productList));
    }

    def getProductList():List[String] = {
        var productList = List[String]();
        var item = "";
        while(item != "done"){
            item = readLine("Enter a product name (or type 'done' to finish): ");
            if(item != "done"){
                productList = productList :+ item;
            }
        }
        return productList;
    }

    def printProductList(products: List[String]):Unit = {
        for(i <- products.indices){
            println(s"${i+1} - ${products(i)}");
        }
    }

    def getTotalProducts(products: List[String]):Int = {
        products.length;
    }
}