package org.overmind.slots.gameserver

import io.kotest.core.spec.style.StringSpec

class ScreenTest : StringSpec({

    "by reels" {
        Screen.byReels {
            reel(s0, s1, s2)
            reel(s2, s1, s2)
            reel(s0, s1, s0)
        }
    }

    "by rows" {
        Screen.byRows {
            row(s0, s1, s2)
            row(s2, s1, s2)
            row(s0, s1, s0)
        }
    }
})
