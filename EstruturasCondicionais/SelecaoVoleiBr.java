package MainPrimitivos.EstruturasCondicionais;

public class SelecaoVoleiBr {
    public static void main(String[] args) {
        int age = 31;

        if(age < 15 && age > 0){
            System.out.println("Sou da base da seleção brasileira de vôlei");
        } else if (age >= 16 && age < 20) {
            System.out.println("Sou intermediario no vôlei mas ainda na base da seleção");
        } else if (age > 20 && age <= 30) {
            System.out.println("Jogo no time principal de vôlei");

        } else {
            System.out.println("Não jogo vôlei");
        }


    }
    }

