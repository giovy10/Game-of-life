package com.example.gameoflife

import org.junit.Test

import org.junit.Assert.*
import java.util.*

class WorldTest {

    @Test
    fun getWorldIsEmpty() {
        val world = World(20,20)
        val expected = 0
        val output = world.world

        assertEquals(output.size,expected)
    }

    @Test
    fun getInitialWorldIsNotEmpty() {
        val world = World(20,20)
        val expected = 400
        val output = world.initialWorld()

        assertEquals(output.size.times(output[0].size),expected)
    }


    @Test
    fun transform2dTo1dArray() {
        val cell = Cell(TypeCell.ALIVE)
        val input = Array(5) { Array(5) { cell } }
        val output: Array<Cell>
        val expected = arrayOf(cell,cell,cell,cell,cell,cell,cell,cell,cell,cell,
            cell,cell,cell,cell,cell,cell,cell,cell,cell,cell,cell,cell,cell,cell,cell)

        val world = World(5,5)
        output = world.transform2dTo1dArray(input).toTypedArray()
        assertArrayEquals(output,expected)
    }

    @Test
    fun numNeighboursOf() {
        val output : Int
        val expected = 0
        val world=World(5,5)

        output = world.numNeighboursOf(3,3)
        assertEquals(output,expected)
    }


}