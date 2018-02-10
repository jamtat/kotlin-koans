package iii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

operator fun MyDate.rangeTo(other: MyDate): DateRange = DateRange(this, other)

operator fun MyDate.compareTo(other: MyDate): Int = when {
    year != other.year -> year - other.year
    month != other.month -> month - other.month
    else -> dayOfMonth - other.dayOfMonth
}

operator fun MyDate.inc(): MyDate = this.nextDay()

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate =
        this + RepeatedTimeInterval(timeInterval)

operator fun MyDate.plus(timeInterval: RepeatedTimeInterval) =
        addTimeIntervals(timeInterval.timeInterval, timeInterval.repetitions)