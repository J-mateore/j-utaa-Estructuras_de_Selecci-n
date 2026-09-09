Algoritmo ControlHora
	Definir horas, minutos, segundos Como Entero
	Definir respuesta Como Cadena
	Repetir
		Escribir 'Ingrese las horas (0 a 23):'
		Leer horas
		Escribir 'Ingrese los minutos (0 a 59):'
		Leer minutos
		Escribir 'Ingrese los segundos (0 a 59):'
		Leer segundos
		Si horas>=0 Y horas<=23 Y minutos>=0 Y minutos<=59 Y segundos>=0 Y segundos<=59 Entonces
			Escribir 'Hora registrada exitosamente: ', horas, ':', minutos, ':', segundos
		SiNo
			Escribir 'Error: La hora ingresada no es valida.'
		FinSi
		Escribir '¿Desea cambiar la hora? (S/N):'
		Leer respuesta
	Hasta Que respuesta='N' O respuesta='n'
	Escribir 'Programa finalizado.'
FinAlgoritmo
