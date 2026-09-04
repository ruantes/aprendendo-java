package flamingo.aprendendo.basico;

public class EstruturasCondicionaisParte01 {
    public static void main(String[] args) {
        byte idade = 17;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida){
            System.out.println("Pode comprar bebida alcoolica");
        }
    }
}
