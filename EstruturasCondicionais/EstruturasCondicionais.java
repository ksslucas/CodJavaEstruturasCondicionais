package MainPrimitivos.EstruturasCondicionais;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        int age = 30;
        float salario = 2500;
        if (age > 25 && salario > 2800){

            System.out.println("A idade de Lucas é maior que 25 e seu salário é maior que 2.000 Reais.");
        } else {

            System.out.println("Lucas tem menos de 25 anos e seu salário pe menor que 2.000 Reais.");
        }

        int ageAdulto = 18;
        boolean autorizadoCComprarbebida = ageAdulto <= 17;


        System.out.println("=========================");

        if(autorizadoCComprarbebida){
            System.out.println("O user é maior de idade? :"+ autorizadoCComprarbebida);
            if(true){
                System.out.println("O user está autorizado a comprar bebida");
            }
        } else {
            System.out.println("O user não está autorizado a comprar bebidas, pois é menor de idade");
        }

    }
}
