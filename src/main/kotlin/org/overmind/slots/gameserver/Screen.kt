package org.overmind.slots.gameserver

data class Screen(val reels: List<List<Symbol>>) {

    interface ByReelsBuilder {
        fun reel(vararg reel: Symbol)
    }

    interface ByRowsBuilder {
        fun row(vararg row: Symbol)
    }

    companion object {

        fun byReels(init: ByReelsBuilder.() -> Unit): Screen {
            val reels = mutableListOf<List<Symbol>>()

            val byReelsBuilder = object : ByReelsBuilder {
                override fun reel(vararg reel: Symbol) {
                    reels.add(reel.asList())
                }
            }

            byReelsBuilder.init()
            return Screen(reels.toList())
        }

        fun byRows(init: ByRowsBuilder.() -> Unit): Screen {
            val rows = mutableListOf<List<Symbol>>()

            val byRowsBuilder = object : ByRowsBuilder {
                override fun row(vararg row: Symbol) {
                    rows.add(row.asList())
                }
            }

            byRowsBuilder.init()
            return Screen(rows.toList())
        }

    }
}
