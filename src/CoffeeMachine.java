public class CoffeeMachine {
    // 필요한 영단어
    // Coffee, Milk, Money, CoffeeBeans
    // Ingredient (재료)  DisposableCup (일회용컵)
    // Order (주문)
    // Buy(사다), Fill(채우다), Take(가져가다)

    // 먼저 문제상황을 파악하고, 요구사항을 분석하여 이해한 후,
    // 어떤 타입들이 어떤 관계를 맺는지 설계해서 작성해보세요.
    // (다이어그램을 그려도 좋고,
    // 의사코드(pseudo code)로 작성하셔도 좋아요)
    // 설계된 대로 조금씩 구현하시면서, 구현된 내용을 테스트 해보세요.
    // 테스트를 통과했다면 스스로를 칭찬해주시고,
    // Git Commit & Push 를 해주세요.
    // 다시 내가 작성한 설계단계로 돌아가, 그 다음 부분을 구현하고, 테스트하고 Commit을 반복하면서 기능을 조금씩 완성해보세요.

    // 필드
    Water water;
    Milk milk;
    CoffeeBean coffeeBean;
    Cup cup;
    Money money;
    // 생성자

    public CoffeeMachine(Water water, Milk milk, CoffeeBean coffeeBean, Cup cup, Money money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBean = coffeeBean;
        this.cup = cup;
        this.money = money;
    }

    // 메소드
    void 구매() {};
    void 채우기() {};
    void 가져가기() {};
    void 작동() {
        System.out.println("커피머신이 작동했습니다!");
    };
    void 재료출력() {};

    // 실행 메소드
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(new Water(400),
                new Milk(540), new CoffeeBean(120),
                new Cup(9), new Money(50000));
        coffeeMachine.작동();
    }
}
abstract class Ingredient {
    private int amount;

    public Ingredient(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
class Water extends Ingredient {
    public Water(int amount) {
        super(amount);
    }
}
class Milk extends Ingredient {
    public Milk(int amount) {
        super(amount);
    }
}
class CoffeeBean extends Ingredient {
    public CoffeeBean(int amount) {
        super(amount);
    }
}
class Cup extends Ingredient {
    public Cup(int amount) {
        super(amount);
    }
}
class Money extends Ingredient {
    public Money(int amount) {
        super(amount);
    }
}

abstract class Coffee {
    Water needWater;
    Milk needMilk;
    CoffeeBean needCoffeeBean;
    Money price;
}
