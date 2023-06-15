fun main(){
    var price=40


}
fun discountedprice(input:Int,percentagedis:Double):Double {
    var price = 0.3
    var discount=price *percentagedis
    val total=input+discount

    return total.toDouble()
}
/*function calculateDiscountedPrice($price, $discountPercentage) {
    // Convert the discount percentage to a decimal value
    $discount = $discountPercentage / 100;

    // Calculate the discounted price
    $discountedPrice = $price - ($price * $discount);

    // Return the discounted price
    return $discountedPrice;
}

// Test the function
$price = 100.0;
$discountPercentage = 20;
$discountedPrice = calculateDiscountedPrice($price, $discountPercentage);
echo "Discounted price: " . $discountedPrice;
*/