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

import java.util.Random;

/**
 *
 * @author Jinlai
 */
public final class UtilesRandom {

    public static final Random RND = new Random();

    public static final int leerEnteroRamdon(String msg, int min, int max) {
        int num;
        System.out.print(msg);
        num = RND.nextInt(max - min + 1) + min;
        return num;
    }

    public static final double leerRealRamdon(String msg, double min, double max) {
        double real;
        System.out.print(msg);
        real = RND.nextDouble() * (max - min) + min;
        return real;
    }

    public static final boolean leerBooleanRandom(String msg) {
        boolean esBoleano;
        System.out.print(msg);
        esBoleano = RND.nextBoolean();
        return esBoleano;
    }

    public static final char leerCaracterRandom(String msg, char max, char min) {
        System.out.print(msg);
        char valor = (char) (RND.nextInt(max - min + 1) + min);
        return valor;
    }

    public static final int leerEnteroRamdon(int min, int max) {
        int num;
        num = RND.nextInt(max - min + 1) + min;
        return num;
    }

    public static final double leerRealRamdon(double min, double max) {
        double real;
        real = RND.nextDouble() * (max - min) + min;
        return real;
    }

}
