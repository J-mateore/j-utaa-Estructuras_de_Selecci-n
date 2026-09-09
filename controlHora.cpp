#include <iostream>
#include <string>

using namespace std;

int main() {
    int horas, minutos, segundos;
    char respuesta;

    do {
        // Captura de datos
        cout << "Ingrese las horas (0 a 23): ";
        cin >> horas;
        cout << "Ingrese los minutos (0 a 59): ";
        cin >> minutos;
        cout << "Ingrese los segundos (0 a 59): ";
        cin >> segundos;

        // Validacion de rango
        if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
            cout << "Hora registrada exitosamente: ";
            if (horas < 10) cout << "0";
            cout << horas << ":";
            if (minutos < 10) cout << "0";
            cout << minutos << ":";
            if (segundos < 10) cout << "0";
            cout << segundos << endl;
        } else {
            cout << "Error: La hora ingresada no es valida." << endl;
        }

        // Consulta de repeticion
        cout << "¿Desea cambiar la hora? (S/N): ";
        cin >> respuesta;

    } while (respuesta == 'S' || respuesta == 's');

    cout << "Programa finalizado." << endl;
    return 0;
}