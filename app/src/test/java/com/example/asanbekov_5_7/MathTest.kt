package com.example.asanbekov_5_7

import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {

    var math: Math? = null

    @Before
    fun init() {
        math = Math()
    }

    @Test
    fun simpleAdd() {
        assertEquals("5", math?.add("2", "3"))
    }

    @Test
    fun spaceAdd() {
        assertEquals("5", math?.add("2", "3  "))
    }

    @Test
    fun dotAdd() {
        assertEquals("5.0", math?.add("2", "3.0"))
    }

    @Test
    fun symbolAdd() {
        assertEquals("Вы ввели символы", math?.add("2", "3 //asdflf128"))
    }

    @Test
    fun doubleAdd() {
        assertEquals("5.1", math?.add("2.2", "2.9"))
    }

    @Test
    fun emptyAdd() {
        assertEquals("Вы не заполнили поля", math?.add("2", ""))
    }

    @Test
    fun simpleDivide() {
        assertEquals("6", math?.divide("12", "2"))
    }

    @Test
    fun zeroDivide() {
        assertEquals("На ноль делить нельзя", math?.divide("12", "0"))
    }

    @After
    fun detach() {
        math = null
    }

}