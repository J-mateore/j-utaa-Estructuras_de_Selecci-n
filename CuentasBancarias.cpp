#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    int opcion;
    double saldo = 100.0; // Saldo inicial
    double monto;

    // Configurar impresion a 2 decimales para dinero
    cout << fixed << setprecision(2);

    do {
        cout << "=== MENU BANCARIO ===" << endl;
        cout << "Saldo actual: $" << saldo << endl;
        cout << "1. Depositar" << endl;
        cout << "2. Retirar" << endl;
        cout << "3. Salir" << endl;
        cout << "Seleccione una opcion: ";
        cin >> opcion;

        switch (opcion) {
            case 1:
                cout << "Ingrese el monto a depositar: $";
                cin >> monto;
                if (monto > 0) {
                    saldo += monto;
                    cout << "Deposito realizado. Nuevo saldo: $" << saldo << endl;
                } else {
                    cout << "Error: El monto debe ser mayor a 0." << endl;
                }
                break;

            case 2:
                cout << "Ingrese el monto a retirar: $";
                cin >> monto;
                if (monto > 0 && monto <= saldo) {
                    saldo -= monto;
                    cout << "Retiro realizado. Nuevo saldo: $" << saldo << endl;
                } else if (monto > saldo) {
                    cout << "Error: Saldo insuficiente." << endl;
                } else {
                    cout << "Error: El monto debe ser mayor a 0." << endl;
                }
                break;

            case 3:
                cout << "Gracias por usar el sistema bancario." << endl;
                break;

            default:
                cout << "Opcion no valida." << endl;
                break;
        }
        cout << endl;

    } while (opcion != 3);

    return 0;
}