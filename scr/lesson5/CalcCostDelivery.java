package lesson5;

// Клас розрахунку вартості товару,
// враховуючи вартість доставки
// ЗАВДАННЯ: Виправити код класу.
// Клас успадковує клас CalcCostBase.
public class CalcCostDelivery extends CalcCostBase {

    // Вартість доставки
    private static double deliveryPrice ;

    // Розрахунок вартості товару,
    // з урахуванням вартості доставки
    @Override
    public double calcCost(Product product) {
        return product.getPrice()
                + deliveryPrice;
    }
}
