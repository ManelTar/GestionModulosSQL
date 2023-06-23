/*
 * Copyright 2022 alumnoT.
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
 * @author alumnoT
 */
public final class UtilesOperacion {

    public static final int OP_SUM = 0; // Suma
    public static final int OP_RES = 1; // Resta
    public static final int OP_MUL = 2; // Producto
    public static final int OP_DIV = 3; // Cociente
    public static final int OP_MOD = 4; // Resto
    public static final int OP_MED = 5; // Media
    public static final int OP_MAY = 6; // Mayor
    public static final int OP_MEN = 7; // Menor

    private UtilesOperacion() {
    }

    public static final double operar(double n1, double n2, int op) {
        double n;
        switch (op) {
            case OP_SUM:
                n = suma(n1, n2);
                break;
            case OP_RES:
                n = resta(n1, n2);
                break;
            case OP_MUL:
                n = producto(n1, n2);
                break;
            case OP_DIV:
                n = cociente(n1, n2);
                break;
            case OP_MOD:
                n = resto(n1, n2);
                break;
            case OP_MED:
                n = media(n1, n2);
                break;
            case OP_MAY:
                n = mayor(n1, n2);
                break;
            case OP_MEN:
                n = menor(n1, n2);
                break;
            default:
                n = 0;
        }
        return n;
    }

    private static double suma(double n1, double n2) {
        double n = n1 + n2;
        return n;
    }

    private static double resta(double n1, double n2) {
        double n = n1 - n2;
        return n;
    }

    private static double producto(double n1, double n2) {
        double n = n1 * n2;
        return n;
    }

    private static double cociente(double n1, double n2) {
        double n = n1 / n2;
        return n;
    }

    private static double resto(double n1, double n2) {
        double n = n1 % n2;
        return n;
    }

    private static double media(double n1, double n2) {
        double n = (n1 + n2) / 2;
        return n;
    }

    private static double mayor(double n1, double n2) {
        double n;
        if (n1 > n2) {
            n = n1;
        } else {
            n = n2;
        }
        return n;
    }
    
    private static double menor(double n1, double n2) {
        double n;
        if (n1 < n2) {
            n = n1;
        } else {
            n = n2;
        }
        return n;
    }
}
