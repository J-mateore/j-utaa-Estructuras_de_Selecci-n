#include <iostream>
#include <iomanip>
#include <cctype>

using namespace std;

int main() {
    int cantidad;
    double costoTela, manoObra, costoProduccion, ganancia, precioVenta;
    double costoTotal, gananciaTotal, ventaTotal;
    char modelo;

    cout << "=== FABRICA DE JEANS ===" << endl;
    cout << "Ingrese la cantidad de jeans a producir: ";
    cin >> cantidad;
    cout << "Ingrese el costo de la tela por unidad: $";
    cin >> costoTela;
    cout << "Ingrese el modelo del jean (A / B): ";
    cin >> modelo;

    // Normalizar a mayuscula
    modelo = toupper(modelo);

    // Calculo de mano de obra segun el modelo
    if (modelo == 'A') {
        manoObra = costoTela * 0.80;
    } else if (modelo == 'B') {
        manoObra = costoTela * 0.95;
    } else {
        cout << "Modelo no valido. Se aplicara Modelo A por defecto." << endl;
        manoObra = costoTela * 0.80;
    }

    // Calculos por unidad
    costoProduccion = costoTela + manoObra;
    ganancia = costoProduccion * 0.30;
    precioVenta = costoProduccion + ganancia;

    // Calculos totales
    costoTotal = costoProduccion * cantidad;
    gananciaTotal = ganancia * cantidad;
    ventaTotal = precioVenta * cantidad;

    // Formato de impresion a 2 decimales
    cout << fixed << setprecision(2);
    cout << "\n=== RESUMEN DE PRODUCCION ===" << endl;
    cout << "Costo de produccion por unidad: $" << costoProduccion << endl;
    cout << "Ganancia por unidad: $" << ganancia << endl;
    cout << "Precio de venta por unidad: $" << precioVenta << endl;
    cout << "----------------------------------" << endl;
    cout << "Costo Total del Lote: $" << costoTotal << endl;
    cout << "Ganancia Total del Lote: $" << gananciaTotal << endl;
    cout << "Ingreso Total por Venta: $" << ventaTotal << endl;

    return 0;
}