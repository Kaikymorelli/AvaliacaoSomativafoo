package AvaliativaSomativa;

public class PrincipalPedido {
	
	public static void main(String[] args) {
		
		Pedido pedido1 = new Pedido (1, "Chocolate", 3);
		
		pedido1.getId();
		pedido1.getProduto();
		pedido1.getQuantidade();
		
		System.out.println( pedido1.getId());
		System.out.println( pedido1.getProduto());
	    System.out.println( pedido1.getQuantidade());
		
	}

}
