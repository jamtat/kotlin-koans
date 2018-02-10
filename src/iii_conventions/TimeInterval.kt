package iii_conventions

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

data class RepeatedTimeInterval(val timeInterval: TimeInterval, val repetitions: Int = 1)

operator fun TimeInterval.times(x: Int): RepeatedTimeInterval =
        RepeatedTimeInterval(timeInterval = this, repetitions = x)