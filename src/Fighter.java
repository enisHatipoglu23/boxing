public class Fighter {
    String name;
    int health;
    int weight;
    int damage;
    int block;
    int first;


    Fighter(String name, int health, int weight, int damage, int block, int first){
        this.name = name;
        this.health = health;
        this.weight = weight;
        this.damage = damage;
        if (this.block >= 0 && this.block <= 100){
            this.block = block;
        }else{
            this.block = 0;
        }
        if (this.first >= 0 && this.first <= 100){
            this.first = first;
        }else{
            this.first = 0;
        }

    }

    int hit(Fighter rival){
        if (checkFirst()){

        }
        System.out.println(this.name + rival.name + "'e " + this.damage + " vurdu. ");
        if (rival.isBlock()){
            System.out.println(rival.name + " is blocked"+ this.name + "'s punch " + "! ! !");
            return rival.health;
        }
        if ((rival.health - this.damage) <= 0){
            return 0;
        }
        if (rival.health <= 0 ){
            System.out.println(this.name + " is WINNER ! ! !");

        }
        return (rival.health - this.damage);
    }
    boolean isBlock(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.block;
    }
    boolean checkFirst(){
        double randomNumber = Math.random() * 100;
        return randomNumber <=this.first;
    }
}
