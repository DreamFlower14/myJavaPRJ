package Class;

class Car1 {
    String color;
    int speed;
    
    void upSpeed(int value) {
        speed += value;
        System.out.println("속도를 "+ speed +"올립니다");
    }

    void downSpeed(int value) {
        if ((speed -= value) > 0) {
            speed -= value;
            System.out.println("속도를 "+ speed +"내립니다");
        }else {
            System.out.print("속도를 0 이하로 내릴 수 없습니다!");
        }

        }
}

class Sedan extends Car1{
    int seatNum;
    
    int getSeatNum() {
        return seatNum;
    }
}

class Truck extends Car1{
    int catacity;

    int getCatacity() {
        return catacity;
    }
}

public class C0615_2 {
    public static void main(String[] args) {
        
        Sedan sedan1 = new Sedan();
        Truck truck1 = new Truck();
        
        sedan1.upSpeed(300);
        truck1.upSpeed(100);
        
        sedan1.seatNum = 5;
        truck1.catacity = 50;

        System.out.println("승용차 속도는 " + sedan1.speed + "km, 좌석수는 " + sedan1.getSeatNum() + "개 입니다");
        System.out.println("트럭 속도는 " + truck1.speed + "km, 적재량은 " + truck1.getCatacity() + "톤 입니다");
        
    }
}

