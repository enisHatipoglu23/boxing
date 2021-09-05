public class Match {
    int min;
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    boolean isAvilable(){
        return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) &&
                (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));
    }

    void run(){
        if (isAvilable()){
            System.out.println("This match is equable.\n ");
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\nMATCH IS BEGNING IN A FEW SECONDS ! ! !");

            while(this.f1.health > 0 && this.f2.health > 0){
                System.out.println("-*-*-*-*-*- new Round -*-*-*-*-*-");
                if (f1.checkFirst()){
                    this.f2.health = this.f1.hit(f2);
                    System.out.println(this.f2.name + "'s health :  " + f2.health + "\n");
                }
                if (isWin()){
                    break;
                }

                if (f2.checkFirst()){
                    this.f1.health = this.f2.hit(f1);
                    System.out.println(this.f1.name + "'s health :  " + f1.health);
                }

                if (isWin()){
                    break;
                }
            }
        }else{
            System.out.println("Thoose figters are not equal. ");
        }
    }
    boolean isWin(){
        if (this.f1.health <= 0){
            System.out.println(this.f2.name + " is WINNER ! ! ! ");
            return true;
        }else if (this.f2.health <= 0){
            System.out.println(this.f1.name + " is WINNER ! ! ! ");
            return true;
        }
        return false;
    }

}
