/*
 * Copyright 2022 Jinlai.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

/**
 *
 * @author Jinlai
 */
public final class UtilesDNI {

    public static final char calcularLetra(int num) {
        char letra = ' ';
        switch (num % 23) {
            case 0:
                letra = 'T';
                break;
            case 1:
                letra = 'R';
                break;
            case 2:
                letra = 'W';
                break;
            case 3:
                letra = 'A';
                break;
            case 4:
                letra = 'G';
                break;
            case 5:
                letra = 'M';
                break;
            case 6:
                letra = 'Y';
                break;
            case 7:
                letra = 'F';
                break;
            case 8:
                letra = 'P';
                break;
            case 9:
                letra = 'D';
                break;
            case 10:
                letra = 'X';
                break;
            case 11:
                letra = 'B';
                break;
            case 12:
                letra = 'N';
                break;
            case 13:
                letra = 'J';
                break;
            case 14:
                letra = 'Z';
                break;
            case 15:
                letra = 'S';
                break;
            case 16:
                letra = 'Q';
                break;
            case 17:
                letra = 'V';
                break;
            case 18:
                letra = 'H';
                break;
            case 19:
                letra = 'L';
                break;
            case 20:
                letra = 'C';
                break;
            case 21:
                letra = 'K';
                break;
            case 22:
                letra = 'E';
                break;
        }
        return letra;
    }

    public static final boolean validadDNI(int num, char chr) {
        char letra = calcularLetra(num);
        return letra == chr;
    }

    public static final void introDNI() {
        int num;
        char crt;
        boolean dniOK;
        do {
            num = UtilesEntrada.leerEnteroRango("Numero DNI ....: ", 1, 99999999);
            crt = UtilesEntrada.leerCaracterRango("Letra DNI ....: ", 'A', 'Z');
            dniOK = UtilesDNI.validadDNI(num, crt);
            if (!dniOK) {
                System.out.printf("DNI Incorrecto%n");
                System.out.println("---");
            }
        } while (!dniOK);
        System.out.printf("El DNI es.......: %d%c%n",num,crt);
    }
}
