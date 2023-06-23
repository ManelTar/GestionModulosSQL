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

/**
 *
 * @author alumnoT
 */
public final class UtilesSorteos {

    public static final int LONGITUD_BOMBO_PRIMITIVAMIN = 0;
    public static final int LONGITUD_BOMBO_PRIMITIVA = 48;
    public static final int LONGITUD_APUESTA_PRIMITIVA = 6;

    private UtilesSorteos() {
    }

    public static final int[] generarApuestaPrimitiva() {
        int[] lista = UtilesArray.generarArrayEnteroAleatorioNoRepetidoBombo(LONGITUD_APUESTA_PRIMITIVA);
        return lista;
    }

}
