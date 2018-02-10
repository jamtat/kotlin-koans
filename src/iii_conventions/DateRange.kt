package iii_conventions

class DateRange(val start: MyDate, val endInclusive: MyDate)

operator fun DateRange.contains(date: MyDate): Boolean =
        date >= start && date <= endInclusive

operator fun DateRange.iterator(): Iterator<MyDate> = DateIterator(this)

class DateIterator(private val range: DateRange): Iterator<MyDate> {
    var current = range.start

    override fun next(): MyDate = current++

    override fun hasNext(): Boolean = current <= range.endInclusive
}