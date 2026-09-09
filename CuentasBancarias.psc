Algoritmo CuentasBancarias
	Definir opcion Como Entero
	Definir saldo, monto Como Real
	saldo <- 100.0
	Repetir // Saldo inicial predeterminado
		Escribir '=== MENÚ BANCARIO ==='
		Escribir 'Saldo actual: $', saldo
		Escribir '1. Depositar'
		Escribir '2. Retirar'
		Escribir '3. Salir'
		Escribir 'Seleccione una opcion:'
		Leer opcion
		Según opcion Hacer
			1:
				Escribir 'Ingrese el monto a depositar:'
				Leer monto
				Si monto>0 Entonces
					saldo <- saldo+monto
					Escribir 'Deposito realizado. Nuevo saldo: $', saldo
				SiNo
					Escribir 'Error: El monto debe ser mayor a 0.'
				FinSi
			2:
				Escribir 'Ingrese el monto a retirar:'
				Leer monto
				Si monto>0 Y monto<=saldo Entonces
					saldo <- saldo-monto
					Escribir 'Retiro realizado. Nuevo saldo: $', saldo
				SiNo
					Si monto>saldo Entonces
						Escribir 'Error: Saldo insuficiente.'
					SiNo
						Escribir 'Error: El monto debe ser mayor a 0.'
					FinSi
				FinSi
			3:
				Escribir 'Gracias por usar el sistema bancario.'
			De Otro Modo:
				Escribir 'Opcion no valida.'
		FinSegún
		Escribir ''
	Hasta Que opcion=3
FinAlgoritmo
