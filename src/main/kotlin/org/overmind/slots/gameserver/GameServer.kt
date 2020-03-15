package org.overmind.slots.gameserver

data class State(val screen: Screen)

data class Config(val initialScreen: Screen)

class GameServer {

    fun initialState(config: Config): State {
        return State(screen = config.initialScreen)
    }

    fun doAction(action: Action, state: State, config: Config): State {
        return when (action) {
            is Spin -> doSpin(action, state, config)
        }
    }

    private fun doSpin(action: Spin, state: State, config: Config): State {
        TODO()
    }
}
