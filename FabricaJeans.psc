Algoritmo FabricaJeans
	Definir cantidad Como Entero
	Definir costoTela, manoObra, costoProduccion, ganancia, precioVenta Como Real
	Definir costoTotal, gananciaTotal, ventaTotal Como Real
	Definir modelo Como Caracter
	
	Escribir "Ingrese la cantidad de jeans a producir:"
	Leer cantidad
	Escribir "Ingrese el costo de la materia prima (tela) por jean:"
	Leer costoTela
	Escribir "Ingrese el modelo del jean (A / B):"
	Leer modelo
	
	// Calculo de mano de obra segun el modelo
	Si modelo = "A" O modelo = "a" Entonces
		manoObra <- costoTela * 0.80
	Sino
		Si modelo = "B" O modelo = "b" Entonces
			manoObra <- costoTela * 0.95
		Sino
			Escribir "Modelo no valido. Se aplicara modelo A por defecto."
			manoObra <- costoTela * 0.80
		FinSi
	FinSi
	
	// Calculos unitarios
	costoProduccion <- costoTela + manoObra
	ganancia <- costoProduccion * 0.30
	precioVenta <- costoProduccion + ganancia
	
	// Calculos totales
	costoTotal <- costoProduccion * cantidad
	gananciaTotal <- ganancia * cantidad
	ventaTotal <- precioVenta * cantidad
	
	// Salida de resultados
	Escribir ""
	Escribir "=== RESUMEN DE PRODUCCION ==="
	Escribir "Costo de produccion por unidad: $", costoProduccion
	Escribir "Ganancia por unidad: $", ganancia
	Escribir "Precio de venta por unidad: $", precioVenta
	Escribir "----------------------------------"
	Escribir "Costo Total del Lote: $", costoTotal
	Escribir "Ganancia Total del Lote: $", gananciaTotal
	Escribir "Ingreso Total por Venta: $", ventaTotal
FinAlgoritmo