public class Principal{
	public static void main(String[] args) {
		
		// Pruebas
		CajeroElectronico cj_01 = new CajeroElectronico(3, 250000000, 1500000, 50, 50, 0, 0, "BancoSena", "andres9649", "12345");
		
		cj_01.actualizarTotalCajero("andres9649", "12345", 20000000, 200, 200, 200, 40);
		cj_01.imprimirDatosCajero();

		TarjetaDebito tj_01 = new TarjetaDebito("1111222233334444", "Oscar Loaiza", "54321", 1000000);
		
		cj_01.retirarDineroTarjeta(tj_01, "54321", 780000);
		cj_01.imprimirDatosCajero();
		cj_01.consultarSaldoTarjeta(tj_01, "54321");
		cj_01.imprimirDatosCajero();
		cj_01.cambiarClave(tj_01,"54321", "12234");
		cj_01.imprimirDatosCajero();
		cj_01.transferirDineroaTarjeta(tj_01, 0, 0, 2, 0);
		cj_01.consultarSaldoTarjeta(tj_01, "12234");
		cj_01.imprimirDatosCajero();
		tj_01.imprimirLogTarjeta();
		


	}
}