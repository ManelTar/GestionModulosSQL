/*
 * Copyright 2023 alumnoT.
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

import java.util.Locale;

/**
 *
 * @author alumnoT
 */
public final class UtilesArray {

    public static final int[] BOMBO = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49};
    public static final String[] NOMBRES = {"PEPE", "PACO", "PITO", "JUAN", "ABEL", "CARLOS"};

    private UtilesArray() {
    }

    public static int buscar(String nombre, String[] lista) {
        int posicion = -1;
        try {
            boolean busqueda = true;
            int i = 0;
            do {
                if (i >= lista.length) {
                    busqueda = false;
                } else if (lista[i].equals(nombre)) {
                    busqueda = false;
                    posicion = i + 1;
                } else {
                    i++;
                }
            } while (busqueda);
        } catch (Exception e) {
            System.out.println("ERROR: Busqueda cancelada");
        }
        return posicion;
    }

    public static final void listarArrayNombresAleatorios(String msg, String[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.printf(msg, i + 1, lista[i]);
        }
    }

    public static final String obtenerNombreAleatorio() {
        int num = UtilesRandom.leerEnteroRamdon(0, NOMBRES.length - 1);
        return NOMBRES[num];
    }

    public static final String[] obtenerArrayNombresAleatorios(int longitud) {
        String[] nombre = new String[longitud];
        for (int i = 0; i < nombre.length; i++) {
            nombre[i] = obtenerNombreAleatorio();
        }
        return nombre;
    }

    public static final double[] generarArrayRealAleatorio(int longitud) {
        double lista[] = new double[longitud];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = UtilesRandom.leerRealRamdon(0, 99);
        }
        return lista;
    }

    public static final int[] generarArrayEnteroAleatorio(int longitud) {
        int lista[] = new int[longitud];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = UtilesRandom.leerEnteroRamdon(UtilesSorteos.LONGITUD_BOMBO_PRIMITIVAMIN, UtilesSorteos.LONGITUD_BOMBO_PRIMITIVA);
        }
        return lista;
    }

    public static final int[] generarArrayEnteroAleatorioNoRepetidoBombo(int longitud) {
        int lista[] = new int[longitud];
        for (int i = 0; i < lista.length; i++) {
            int bombo[] = BOMBO;
            int num = UtilesRandom.leerEnteroRamdon(UtilesSorteos.LONGITUD_BOMBO_PRIMITIVAMIN, UtilesSorteos.LONGITUD_BOMBO_PRIMITIVA - i);
            lista[i] = bombo[num];
            bombo[num] = bombo[bombo.length - i - 1];
        }
        return lista;
    }

    public static final void listarArray(String msg, double[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.printf(Locale.ENGLISH, msg, i + 1, lista[i]);
        }
    }

    public static final double Acumular(double[] lista) {
        double suma = 0;
        for (int i = 0; i < lista.length; i++) {
            suma = lista[i] + suma;
        }
        return suma;
    }

    public static final double listaMaximo(double[] lista) {
        double max = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > max) {
                max = lista[i];
            }
        }
        return max;
    }

    public static final int posicionArrayReal(double[] lista) {
        int posicion = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > lista[posicion]) {
                posicion = i;
            }
        }
        return posicion;
    }

    public static final int buscarEntero(int valor, int[] lista) {
        int posicion = -1;
        try {
            boolean seekOK = true;
            int i = 0;
            do {
                if (i >= lista.length) {
                    seekOK = false;
                } else if (lista[i] == valor) {
                    seekOK = false;
                    posicion = i;
                } else {
                    i++;
                }
            } while (seekOK);
        } catch (Exception e) {
            System.out.println("ERROR: Búsqueda cancelada");
        }
        return posicion;
    }

    public static final void listarArray(String msg, int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.printf(msg, i + 1, lista[i]);
        }
    }

    public static int[] ordenarBurbuja(int[] lista) {
        int n = lista.length;
        boolean intercambioRealizado = true;
        if (lista != null) {
            while (intercambioRealizado) {
                intercambioRealizado = false;

                for (int i = 0; i < n - 1; i++) {
                    if (lista[i] > lista[i + 1]) {
                        // intercambiar los elementos
                        int temp = lista[i];
                        lista[i] = lista[i + 1];
                        lista[i + 1] = temp;
                        intercambioRealizado = true;
                    }
                }
            }
        }
        return lista;
    }

    public static int[] ordenarBurbujaDesc(int[] lista) {
        int n = lista.length;
        boolean intercambioRealizado = true;
        if (lista != null) {
            while (intercambioRealizado) {
                intercambioRealizado = false;

                for (int i = 0; i < n - 1; i++) {
                    if (lista[i] < lista[i + 1]) {
                        // intercambiar los elementos
                        int temp = lista[i];
                        lista[i] = lista[i + 1];
                        lista[i + 1] = temp;
                        intercambioRealizado = true;
                    }
                }
            }
        }
        return lista;
    }

    public static int[] desordenarArray(int[] lista) {
        for (int i = lista.length - 1; i > 0; i--) {
            int j = UtilesRandom.leerEnteroRamdon(0, i);
            int temp = lista[i];
            lista[i] = lista[j];
            lista[j] = temp;
        }
        return lista;
    }
}
