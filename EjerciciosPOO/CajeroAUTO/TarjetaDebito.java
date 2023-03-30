import java.util.Date;
public class TarjetaDebito{

	// Atributos
	private String numero;
	private String titular;
	private String password;
	private int saldo;
	private String [] lista_transacciones;


	// Metodos
	public TarjetaDebito(String numero, String titular, String password, int saldo){
		this.numero = numero;
		this.titular = titular;
		this.password = password;
		this.saldo = saldo;
		this.lista_transacciones = new String[5];
	}

	public boolean disminuirSaldo(int valor){
		if (this.saldo >= valor) {
			this.saldo -= valor;
			// registrar en log de tarjeta
			return true;
		}else{
			// registrar en log de la tarjeta
			return false;
		}
	}

	public int getSaldo(){
		return this.saldo;
	}

	public String getNumero(){
		return this.numero;
	}

	public boolean verificarPassword(String password){
		return this.password.equals(password);
		
	}

	public void mostrarSaldo(){
		System.out.println("Este es su nuevo saldo: "+this.saldo);
		this.registrarLogTarjeta("Mostrar Saldo", this.numero, this.saldo, "OK:200");
	}

	public String setPassword(String nueva_contra){
		this.registrarLogTarjeta("Cambio de contrasena", this.numero, 00000000, "OK:200");
		return this.password=nueva_contra;
		
	}
	
	public void setSaldo(int saldo){
		this.saldo=saldo;
		this.registrarLogTarjeta("Saldo aumentado", this.numero, this.saldo, "OK:200");
	}

	public void registrarLogTarjeta(String tipo, String numero_t, int valorTotal,  String estado){
		Date fecha = new Date();
		String log = fecha.toString()+" || "+tipo+" || "+numero_t+" || "+String.valueOf(valorTotal)+" || "+estado;
		
		if (this.lista_transacciones[ this.lista_transacciones.length-1 ] == null) {
			for(int i=0; i<this.lista_transacciones.length; i++){
				if (this.lista_transacciones[i]==null) {
					this.lista_transacciones[i] = log;
					break;
				}
			}
		}else{
			for (int i=0; i<this.lista_transacciones.length-1; i++) {
				this.lista_transacciones[i] = this.lista_transacciones[i+1];
			}
			this.lista_transacciones[this.lista_transacciones.length-1] = log;
		}
	}

	public void imprimirLogTarjeta(){
		System.out.println("-----------------------------------------");
		System.out.println("--------Historial de la tarjeta----------");
		System.out.println("-----------------------------------------");
		for (int i=0; i<this.lista_transacciones.length; i++) {
			if (this.lista_transacciones[i] != null) {
				System.out.println("     => "+this.lista_transacciones[i]);
			}
		}
		System.out.println("-----------------------------------------\n");
	}



}