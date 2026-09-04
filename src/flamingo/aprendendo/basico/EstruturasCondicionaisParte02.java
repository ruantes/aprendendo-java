package flamingo.aprendendo.basico;

public class EstruturasCondicionaisParte02 {
    public static void main(String[] args) {

//        byte idade = 17;
//
//        if(idade >= 18){
//            System.out.println("Pode comprar bebida alcoolica");
//        }else {
//            System.out.println("Não pode comprar bebida alcoolica");
//        }

        byte idade = 16;

        // < 15 - infantil
        // >= 15 && < 18 - juvenil
        // >= 18 - adulto

        if(idade <15){
            System.out.println("Categoria Infantil");
        }else if(idade <18){
            System.out.println("Categoria Juvenil");
        }else{
            System.out.println("Categoria Adulto");
        }
    }
}
