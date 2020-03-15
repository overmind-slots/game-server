package org.overmind.slots.gameserver

sealed class Action

data class Spin(val bet: Int) : Action()
