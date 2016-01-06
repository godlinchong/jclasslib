/*
 This library is free software; you can redistribute it and/or
 modify it under the terms of the GNU General Public
 License as published by the Free Software Foundation; either
 version 2 of the license, or (at your option) any later version.
 */

package org.gjt.jclasslib.bytecode

/**
 * Enum for the possible values of the immediate byte of the [Opcode.NEWARRAY] opcode.
 * @property code Immediate byte value.
 * @property verbose Verbose representation.
 */
@Suppress("NOT_DOCUMENTED")
enum class NewArrayType (val code: Int, val verbose: String) {

    BOOLEAN(4, "boolean"),
    CHAR(5, "char"),
    FLOAT(6, "float"),
    DOUBLE(7, "double"),
    BYTE(8, "byte"),
    SHORT(9, "short"),
    INT(10, "int"),
    LONG(11, "long");


    companion object {
        fun getFromCode(code: Int): NewArrayType? {
            return values().find { it.code == code }
        }
    }
}
