/*
 * Copyright 2020 José A. Pacheco Ondoño - joanpaon@gmail.com.
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
package org.japo.java.entities;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.japo.java.libraries.UtilesEntrada;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public final class DataAccessManager {

    // Sentencias SQL
    // Enseñar tablas
    public static final String DEF_MOD_SQL1 = "SELECT * FROM modulo";
    
    // Insertar tablas
    public static final String DEF_MOD_SQL2
            = "INSERT INTO modulo "
            + "(id, acronimo, nombre, codigo, horasCurso, curso) "
            + "VALUES "
            + "(5, 'SI', 'Sistemas Informáticos', 'MP0382', 180, 1),"
            + "(123, 'FOL', 'Formación y Orientación', 'MP0123', 96, 1),"
            + "(321, 'ING', 'Ingles', 'MP0321', 96, 1)";

    // Borrar tablas
    public static final String DEF_MOD_SQL4 = "DELETE FROM modulo WHERE codigo LIKe 'MP03%'";
    
    // Modificar tablas
    public static final String DEF_MOD_SQL3 = "UPDATE modulo SET curso=2 WHERE horasCurso>150";

    // Cabecera Módulos
    private static final String CAB_LST_MOD1
            = " #  Id          Acrónimo   Nombre                    Código     Horas Curso";
    private static final String CAB_LST_MOD2
            = "=== =========== ========== ========================= ========== ===== =====";

    // Referencias
    private Connection con;
    private Statement stmt;

    // Constructor - Connection
    public DataAccessManager(Connection con) {
        this.con = con;
    }

    // Constructor - Connection + Statement
    public DataAccessManager(Connection con, Statement stmt) {
        this.con = con;
        this.stmt = stmt;
    }

    // --- Accesores ---
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public Statement getStmt() {
        return stmt;
    }

    public void setStmt(Statement stmt) {
        this.stmt = stmt;
    }
    // --- Accesores ---

    // Listado Módulos - SQL
    public final void listarModulos(String sql) throws SQLException {
        // Proceso de listado
        try ( ResultSet rs = stmt.executeQuery(sql)) {
            // Mensaje de inicio de listado
            System.out.println("Listado de módulos ...");

            // Separación
            System.out.println("---");

            // Comprueba si hay datos
            if (rs.next()) {
                // Cabecera
                System.out.println(CAB_LST_MOD1);
                System.out.println(CAB_LST_MOD2);

                // Generación del informe - Fila a fila
                do {
                    // Obtiene los datos del registro actual
                    // Los campos se refieren por su nombre o por su posición
                    // Por su nombre, debe ser exactamente el mismo de la tabla
                    // Por su posición, los campos se numeran a partir del 1
                    // de su posición en la sentencia SQL que los ha obtenido
                    // Frameworks ORM
                    int fila = rs.getRow();
                    // Añadir Campos de la Base de Datos !Cuidado tipo de dato! + nombre tiene que estar igual
                    int id = rs.getInt("id");
//                    int id = rs.getInt(1);
                    String acronimo = rs.getString("acronimo");
//                    String acronimo = rs.getString(2);
                    String nombre = rs.getString("nombre");
                    String codigo = rs.getString("codigo");
                    int horas = rs.getInt("horasCurso");
                    int curso = rs.getInt("curso");

                    // Imprime los datos del registro actual
                    System.out.printf("%03d %-11d %-10s %-25s %-10s %4d %4d%n",
                            fila, id, acronimo, nombre, codigo, horas, curso);

                } while (rs.next());
            } else {
                System.out.println("No hay módulos que mostrar ...");
            }
        }
    }
    
    // Inserción Módulos - SQL
    public void insertarModulos(String sql) throws SQLException {
        // Mensaje de inicio de listado
        System.out.println("Inserción de módulos ...");

        // Separación
        System.out.println("---");

        // Inserción de datos
        int filas = stmt.executeUpdate(sql);

        // Muestra las filas borradas
        System.out.println(filas + " fila/s insertadas/s");
    }

    // Borrado Módulos - SQL
    public void borrarModulos(String sql) throws SQLException {
        // Mensaje de inicio de listado
        System.out.println("Borrado de módulos ...");

        // Separación
        System.out.println("---");

        // Borrado de datos
        int filas = stmt.executeUpdate(sql);

        // Muestra las filas borradas
        System.out.println(filas + " fila/s borrada/s");
    }
    
    // Modificación Módulos - SQL
    public void modificarModulos(String sql) throws SQLException {
        // Mensaje de inicio de listado
        System.out.println("Modificación de módulos ...");

        // Separación
        System.out.println("---");

        // Inserción de datos
        int filas = stmt.executeUpdate(sql);

        // Muestra las filas borradas
        System.out.println(filas + " fila/s modificadas/s");
    }

}
